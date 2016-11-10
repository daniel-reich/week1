class StockPrice2 {
    public static void main(String[] args) {
        int[] stockPrice;
        stockPrice=new int[6];
        stockPrice[0]=30;
        stockPrice[1]=6;
        stockPrice[2]=25;
        stockPrice[3]=99;
        stockPrice[4]=4;
        stockPrice[5]=33;
        
        System.out.println(getMaxProfit(stockPrice));
    }
     
    public static int getMaxProfit(int[] stockPrice){
       
        int minPrice = stockPrice[0];
        for (int i = 0; i < stockPrice.length; i++) {
            if (stockPrice[i] < minPrice) {
            minPrice = stockPrice[i];
            }
        }
        
        int maxPrice=0;
        for (int i = 0; i < stockPrice.length; i++) {
            if (stockPrice[i]==minPrice){
                for (int j = 0; j < stockPrice.length-i; i++) {
                    if (stockPrice[i] > maxPrice) {
                    maxPrice = stockPrice[j];
                    }
                }
            }
            
        }
        
    return maxPrice-minPrice;
    }
}
