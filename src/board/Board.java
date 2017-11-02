package board;

import java.util.Arrays;

import rooms.Room;

public class Board {


    private Room[][] schoolMap;



    public Board(Room[][] schoolMap)
    {
        this.schoolMap = schoolMap;
        //System.out.println(this.schoolMap[0][0]);
    }

    public void printMap()
    {


        for(Room[] row : schoolMap)
        {
            for (Room room : row)
            {
                room.print();
            }
            System.out.println();
        }
    }
    public Room[][] getSchoolMap() {
        return schoolMap;		
    }

    public void setSchoolMap(Room[][] schoolMap) {
        this.schoolMap = schoolMap;
    }


}
