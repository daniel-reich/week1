class PrintH {
    public static void main(String[] args) {
        int size = 9;    // size of the board
        int fullSize =9;
        String str = "H";
        String strMain = "H";
        for(int i=0; i<fullSize; i++){ //row

        str = (i>0 ? "\n" : "") + (i % size == 4 ? "HHHHHHHHH":"H       H");

        System.out.print(str);

    }
    }
}
