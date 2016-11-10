import java.util.*;

class UseArrayList {

        public static void main(String[] args) {
            
            /* Unit Test
            String[] testArray = new String[5];
            testArray[0]="3";
            testArray[1]="7";
            testArray[2]="5";
            testArray[3]="9";
            testArray[4]="4";
            */
            
            ArrayList<Integer> stock_prices = new ArrayList<>();
            
            
            for (int i=0; i<args.length; i++){
                stock_prices.add(Integer.parseInt(args[i]));
            }
                
            
            System.out.println(get_max_profit(stock_prices));
    }

   public static int get_max_profit(ArrayList<Integer> stock) {
        Collections.sort(stock);
        //int minValue = stock.get(0);
        //int maxValue = stock.get(stock.size() - 1);
        
     return (stock.get(stock.size()-1)) - stock.get(0);

    }
}

