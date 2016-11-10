
public class GCDArray {
    
    private long[] longArray = {500, 25000, 20, 100, 1000000, 800, 10};
   

    public static void main(String[] args){
        GCDArray gcdArray = new GCDArray();
        System.out.println(gcdArray.remainder(gcdArray.longArray));
     
    }

    private static long remainder(long[] a){
        GCDArray2 d = new GCDArray2();
        long maxRemainder = 0;
        
        for (int i=0 ; i<a.length ; i++){
            if (d.findRemainder(a[i]) > maxRemainder){
                maxRemainder = d.findRemainder(a[i]);
            }
        }
    return maxRemainder; 
        
    }

}

