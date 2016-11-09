public class IfThenElse {

    private int currentSpeed = 100;

    // if-then-else
    private boolean isMoving() {
        if (currentSpeed > 0){// the "if" clause: currentSpeed is greater than zero
        // TODO: logic here
            return true;// the "then" clause: currentSpeed is greater than zero: return true
            // TODO: logic here
            }else{// the "else" clause: currentSpeed was not greater than zero: return false
                return false;
            }// TODO: logic here
    }
    

    // if-then
    public void applyBrakes() {
        if (currentSpeed > 0){// the "if" clause: bicycle must be moving
        // TODO: logic here
            currentSpeed--;
            }// the "then" clause: decrease current speed
            // TODO: logic here
    }

    // nested if-then-else and if-then-else-if
    public void howFast() {
        // the outer "if" clause: bicycle must be moving
        if (currentSpeed>0){
            // TODO: logic here
            // the inner "if" clause: currentSpeed operators
            if(currentSpeed>0 && currentSpeed<50){
                System.out.println("Slow ("+currentSpeed+"mph)");
            }else if (currentSpeed>50 && currentSpeed<100){
                System.out.println("Fast ("+currentSpeed+"mph)");
            }else{
                System.out.println("Too Fast! ("+currentSpeed+"mph)");
            }
        
            
        }else{
            System.out.println("Not moving");
        }
    }
        
        
    public static void main(String[] args){
        IfThenElse Bike = new IfThenElse();
        Bike.howFast();
        System.out.println("Is the bike moving? "+Bike.isMoving());
        
        Bike.applyBrakes();
        Bike.howFast();
    }      
    
}
