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




	public String chooseMove() {
		Scanner in = new Scanner(System.in);
		while(isValid() == false) {
			System.out.println("Where do you want to move?");
			String x = in.nextLine();
		}
		return in.nextLine();
	}
	
	// write a isValid method that will check whether or not the move made was possible. if it isn't, then prompt player to choose again.
	public boolean isValid() {
		int validCount = 0;
		if(this.x != 0 && this.y != 0) {
			validCount++;
		}
		if(this.x != 0 && this.y != 5) {
			validCount++;
		}
		if(this.x != 5 && this.y != 0) {
			validCount++;
		}
		if(this.x != 0 && this.y != 5) {
			validCount++;
		}
		if(validCount == 4) {
			return true;
		}
		return false;
	}
	
	public void movePlayer(Board tech,String move) {
		Person [] p = {};
		tech.getSchoolMap()[this.x][this.y].setOccupants(p);
		if(move.equals("left")) {
			this.x -= 1;
		}
		if(move.equals("right")) {
			this.x += 1;
		}
		if(move.equals("up")) {
			this.y += 1;
		}
		if(move.equals("down")) {
			this.y -= 1;
		}
		tech.getSchoolMap()[this.x][this.y].addOccupant(this);
	}

}

