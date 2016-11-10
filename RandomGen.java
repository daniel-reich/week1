
import java.util.Random;

public class RandomGen {

   public static void main(String... args) {
        RandomGen randomCalculator = new RandomGen();
        System.out.println(randomCalculator.randomInt(0,100));
   }

    public static int randomInt(int min, int max) {
        
        Random random = new Random();
        int randNumber = random.nextInt();
        
        while (randNumber<min || randNumber>max){
            randNumber = random.nextInt();
        }
        
        return randNumber;
        
    }
}
