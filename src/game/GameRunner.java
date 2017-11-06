package game;

import rooms.*;
import people.Person;
import java.util.Scanner;
import board.Board;
import java.util.Random;

public class GameRunner {
	
    public static void main (String[] args)
    {
        Room[][] map = new Room[5][5];
        for (int j = 0; j<map.length; j++)
        {
        	Room[] row = map[j];
            for (int i = 0; i<row.length; i++)
            {
                boolean[] doors = {true,true,true,true};
                Person[] people = {};

                row[i] = new Hallway(doors, people, i, j);
            }

        }
        
        //System.out.println(map[0][0]);
        Board tech = new Board(map);

        
        boolean gameOn = true;
        int turnCount = 0;
        Person player1 = new Person(5,5,5,0,0);
        Scanner in = new Scanner(System.in);
        System.out.println("It's midnight when your friend calls you. He sounds desperate and wants you to go to Tech. Once you arrive, he is not where to be seen. Suddenly, the door swings open. You enter.");
        map[0][0].addOccupant(player1); 
        Person friend = new Person(1,1,1,3,3);
    	map[3][3].addOccupant(friend);
        tech.printMap();
        while(gameOn)
        {
            String move = player1.chooseMove(tech);
            player1.movePlayer(tech, move);
            turnCount++;
            System.out.println(generateRandomResponse());
            tech.printMap();
            if(turnCount >= 10) {
            	if(player1.getRoom() == friend.getRoom()) {
            		System.out.println("You found your friend! You've won.");
            		gameOn = false;
            	}
            }
            if(turnCount == 15) {
            	System.out.println("You've died. It took you too long. You shouldn't wander around so much next time.");
            	gameOn = false;
            }
        }
    }
    
    public static String generateRandomResponse() {
    	String [] text = {"Something is amiss.", "You have to find him quickly.", "Time is running short."};
    	Random rand = new Random();
		int ab = rand.nextInt(text.length);
		return text[ab];
    }

}



