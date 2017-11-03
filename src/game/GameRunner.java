package game;

import items.Item;
import rooms.*;
import people.Person;

import java.util.Scanner;

import board.Board;

public class GameRunner {
	/* think of the two dimensional array as the board; each item in the board is just a Room class, your player is essentially moving between the array and location "cordinates" aka array[i][x];
	 * this way you can call array[i][x].printdescription to get the story other wise whent the player chooses to move you add or minus one to their "cordinates" and thats what you use to find 
	 * room and feed more story;
	 */
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
                Item[] items = {};

                row[i] = new Hallway(doors, people, items, i, j);
            }

        }
        
        //System.out.println(map[0][0]);
        Board tech = new Board(map);

        
        boolean gameOn = true;
        Person player1 = new Person(5,5,5,0,0);
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Halls of Tech ");
        map[0][0].addOccupant(player1); //This was not functioning because there was not a print method the person
        tech.printMap();
        while(gameOn)
        {
        	//System.out.println("blah");
            String move = player1.chooseMove(tech);
            player1.movePlayer(tech, move);
            tech.printMap();
        }
        //gameOn = false;
		//in.close();
    }

}



