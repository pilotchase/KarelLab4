
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void runRace() {
        while(frontIsClear()){
            collectBeepers();
        }
    }
    
    public void collectBeepers(){
        faceEast();
        findABeeperColumn();
        collectColumn();
        returnFloor();
    }
    
    public void faceEast(){
        while(!facingEast()){
            turnLeft();
        }
    }
    
    public void faceNorth(){
        while(!facingNorth()){
            turnLeft();
        }
    }
    
    public void faceSouth(){
        while(!facingSouth()){
            turnLeft();
        }
    }
    
     public void faceWest(){
        while(!facingWest()){
            turnLeft();
        }
    }
    
    public void findABeeperColumn(){
        faceNorth();
        while(!nextToABeeper()){
            faceEast();
            move();
            faceNorth();
        }
    }
    
    public void collectColumn(){
        while(nextToABeeper()){
            pickBeeper();
            move();
        }
        returnFloor();
    }
    
    public void returnFloor(){
        faceSouth();
        while(frontIsClear()){
            move();
        }
        faceEast();
    }
   
}