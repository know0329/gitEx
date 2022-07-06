import java.util.*;

public class gitExercise 
{
    private boolean state = true;
    public void stateChange(float fever ){
        if(fever > 38){
            this.state = false;
        }
        else
            this.state = true;
    }
    public void setState(boolean state){
        this.state = state;
    }
    public boolean getState(){
        return this.state;
    }
    public static void main(String args[]){
        gitExercise human = new gitExercise();
        human.stateChange(39);
        if (human.getState()){
            System.out.println("출근");
        }
        else {
            System.out.println("병가");
        }
    }
}