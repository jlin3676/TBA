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
	
	public void print() {
		System.out.print("[ X ]");
	}




	public String chooseMove(Board tech) {
		Scanner in = new Scanner(System.in);
		boolean isNotValid = true;
		String temp = null;
		while(isNotValid) {
			System.out.println("Where do you want to move?");
			String x = in.nextLine();
			// logic problem with left 
			if(x.equals("left")) {
				if(this.y - 1 >= 0) {
					isNotValid = false;
					temp = "left";
					//break;
				}
			}
			else if(x.equals("right")) {
				if(this.y+1 < tech.getSchoolMap().length) {
					isNotValid = false;
					temp = "right";
					//break;
				}
			}
			else if(x.equals("up")) {
				if(this.x-1 >= 0) {
					isNotValid = false;
					temp = "up";
					//break;
				}
			}
			// logic error with down
			else if(x.equals("down")) {
				if(this.x+1 < tech.getSchoolMap().length) {
					isNotValid = false;
					temp = "down";
					//break;
				}
			}
		}
		return temp;
	}
	
	
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

