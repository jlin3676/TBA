package board;

import java.util.Arrays;

import rooms.Room;

public class Board {


    private Room[][] schoolMap;



    public Board(Room[][] schoolMap)
    {
        this.schoolMap = schoolMap;
    }

    public void printMap()
    {


        for(Room[] row : schoolMap)
        {
            for (Room room : row)
            {
                room.print();
            }
            System.out.println(schoolMap);
        }
    }
    public Room[][] getSchoolMap() {
        return schoolMap;		
    }

    public void setSchoolMap(Room[][] schoolMap) {
        this.schoolMap = schoolMap;
    }


}
