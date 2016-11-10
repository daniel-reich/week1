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
        if (isMoving()){// the "if" clause: bicycle must be moving
        // TODO: logic here
            currentSpeed--;
            }// the "then" clause: decrease current speed
            // TODO: logic here
    }

    // nested if-then-else and if-then-else-if
    public void howFast() {
        // the outer "if" clause: bicycle must be moving
        if (isMoving()){
            // TODO: logic here
            // the inner "if" clause: currentSpeed operators
            if(currentSpeed>100){
                currentSpeed=currentSpeed-1;
            }else{
                currentSpeed=currentSpeed+1;
            }
        }else{
            currentSpeed=10;
        }
    }
        
        
    public static void main(String[] args){
        IfThenElse Bike = new IfThenElse();
        System.out.println("Is the bike moving? "+Bike.isMoving());
        Bike.applyBrakes();
        Bike.howFast();
    }      
    
}

