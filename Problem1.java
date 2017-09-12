
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends BeeperBot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        findWall();
        while(true){
            searchWestWall();
            searchSouthWall();
            searchEastWall();
            searchNorthWall();
        }
    }
    
    public void exitRoom(){
        move();
        turnOff();
    }
    
    public void findWall(){
        faceWest();
        while(frontIsClear()){
            move();
        }
    }
    
    public void searchWestWall(){
        faceSouth();
        while(frontIsClear()){
            faceWest();
            if(frontIsClear()){
                exitRoom();
            } else {
                faceSouth();
                move();
            }
        }
    }
    
    public void searchSouthWall(){
        faceEast();
        while(frontIsClear()){
            faceSouth();
            if(frontIsClear()){
                exitRoom();
            } else {
                faceEast();
                move();
            }
        }
    }
    
    public void searchEastWall(){
        faceNorth();
        while(frontIsClear()){
            faceEast();
            if(frontIsClear()){
                exitRoom();
            } else {
                faceNorth();
                move();
            }
        }
    }
    
    public void searchNorthWall(){
        faceWest();
        while(frontIsClear()){
            faceNorth();
            if(frontIsClear()){
                exitRoom();
            } else {
                faceWest();
                move();
            }
        }
    }
   
}

