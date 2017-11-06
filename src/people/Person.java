package people;
import rooms.Room;

import java.util.Scanner;

import board.Board;

public class Person {
	
	public static Person Person;
	private int health;
	private int attack;
	private int fatigue;
	private int x;
	private int y;
	private Room room;
	
	public Person(int health, int attack, int fatigue, int x, int y) {
		this.health = health;
		this.attack = attack;
		this.fatigue = fatigue;
		this.x = x;
		this.y = y;
	}
	public void setRoom(Room room) {
		this.room = room;
	}

	public Room getRoom() {
		return this.room;
	}
	
	public void print() {
		System.out.print("[ X ]");
	}



	/*
	 * Allows the user to input a move command. 
	 * If the move is not a valid one, the user will be prompted to make another move.
	 */
	public String chooseMove(Board tech) {
		Scanner in = new Scanner(System.in);
		boolean isNotValid = true;
		String temp = null;
		while(isNotValid) {
			System.out.println("Where do you want to move?");
			String x = in.nextLine();
			
			if(x.equals("left")) {
				if(this.y - 1 >= 0) {
					isNotValid = false;
					temp = "left";
				}
			}
			else if(x.equals("right")) {
				if(this.y+1 < tech.getSchoolMap().length) {
					isNotValid = false;
					temp = "right";
				}
			}
			else if(x.equals("up")) {
				if(this.x-1 >= 0) {
					isNotValid = false;
					temp = "up";
				}
			}
			
			else if(x.equals("down")) {
				if(this.x+1 < tech.getSchoolMap().length) {
					isNotValid = false;
					temp = "down";
				}
			}
		}
		return temp;
	}
	
	/*
	 * Clears the array of people in the existing array.
	 * Takes in a valid move and changes the x and y coordinates of the player.
	 * Adds in the player into the array again with updated coordinates.
	 */
	public void movePlayer(Board tech,String move) {
		Person [] p = {};
		tech.getSchoolMap()[this.x][this.y].setOccupants(p);
		if(move.equals("left")) {
			this.y -= 1;
		}
		if(move.equals("right")) {
			this.y += 1;
		}
		if(move.equals("up")) {
			this.x -= 1;
		}
		if(move.equals("down")) {
			this.x += 1;
		}
		tech.getSchoolMap()[this.x][this.y].addOccupant(this);
	}

	
}

