
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
    
    public void findABeeperColumn(){
        faceNorth();
        while(frontIsClear()){
            faceEast();
            move();
            faceNorth();
        }
    }
    
    public void collectColumn(){
        while(!frontIsClear()){
            move();
            pickBeeper();
        }
    }
    
    public void returnFloor(){
        while(frontIsClear()){
            move();
        }
        faceEast();
    }
   
}