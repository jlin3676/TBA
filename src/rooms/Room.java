package rooms;

import people.Person;

import java.util.Arrays;

public abstract class Room {

    private boolean[] doors;
    private Person[] occupants;
    public boolean explored;
    private int x, y;

    public Room (boolean[] doors, Person[] occupants, int x, int y)
    {
    	this.x = x;
    	this.y = y;
        this.doors = doors;
        this.occupants = occupants;
        this.explored = false;
    }

    public  Person[] getOccupants() {
        return occupants;
    }

    public void setOccupants(Person[] occupants) {
        this.occupants = occupants;
    }

    
    public void addOccupant(Person p) // adds an occupant to your private person array
    {
        this.occupants = Arrays.copyOf(this.occupants,this.occupants.length+1); // search Arrays.copyOf
        this.occupants[this.occupants.length-1] = p;
        p.setRoom(this);
    }
    

    public boolean[] getDoors()
    {
    	return doors;
    }
    
    public int getX()
    {
    	return x;
    }
    
    public int getY()
    {
    	return y;
    }
    public abstract void print();





}
