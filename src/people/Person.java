package people;
import rooms.Room;

public class Person {
	
	public static Person Person;
	private int health;
	private int attack;
	private int fatigue;
	private int x;
	private int y;
	
	public Person(int health, int attack, int fatigue) {
		this.health = health;
		this.attack = attack;
		this.fatigue = fatigue;
	}
/*	public void setRoom(Room room) {
		// TODO Auto-generated method stub
		
	}

	public char[] print() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}
*/

	public void printRoom() {
		// TODO Auto-generated method stub
		
	}

	public String chooseMove() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setCoord(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

