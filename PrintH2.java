class PrintH2 {
    public static void main(String[] args) {

        String[][] twoD = new String[9][9];
        
        for(int i = 0; i<twoD.length; i++) {
            if (i<4 || i>4){
                for(int y = 0; y<twoD[i].length; y++) {
                    twoD[i][y] = (y == 0 ? "H": (y == 8? "H\n" : " "));
                    System.out.print(twoD[i][y]);
                }
            }else{
                for(int y = 0; y<twoD[i].length; y++) {
                    twoD[i][y] = (y == 8 ?  "H\n": "H");
                    System.out.print(twoD[i][y]);
                }
            }
                
        
            }
            
    }
}
