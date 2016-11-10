class StockPrice {
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
        
        int maxValue = stockPrice[0];
        for (int i = 1; i < stockPrice.length; i++) {
            if (stockPrice[i] > maxValue) {
            maxValue = stockPrice[i];
            }
        }
    
    
        int minValue = stockPrice[0];
        for (int i = 1; i < stockPrice.length; i++) {
            if (stockPrice[i] < minValue) {
            minValue = stockPrice[i];
            }
        }
    
    return maxValue-minValue;
    }
}
