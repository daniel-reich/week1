/* Use the following methods to modify the ArrayList below
add(), remove(); set(); isEmpty(), size(), clear(), contains()

create a new ArrayList which equals ArrayList dogs and compare the two with equals()
*/

import java.util.Random;
import java.util.ArrayList;

public class ArrayListMethods {
    public int i;

    public static void main(String[] args) {
       ArrayList<String> dogs = new ArrayList<>();
       dogs.add("pug");
       dogs.add("poodle");
       dogs.add(0, "lhaso");
       dogs.add("poodle");
       dogs.add("golden retriever");
       dogs.add("lab");
       dogs.add("cavalier");
       dogs.add("german shepard");

       System.out.println(dogs);
       
       ArrayList<String> dogs2 = new ArrayList<>();
       dogs2=dogs;
       System.out.println(dogs.equals(dogs2));
       System.out.println(dogs==dogs2);
       
       dogs.add("bulldog");
       System.out.println(dogs); 
       dogs.remove("bulldog"); 
       System.out.println(dogs);
       dogs.set(4, "bulldog"); 
       System.out.println(dogs);
       System.out.println(dogs.size());
       dogs.clear();
       System.out.println(dogs.contains("poodle"));
       System.out.println(dogs.isEmpty());
       
       
    }   

}

