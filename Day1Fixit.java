class Day1Fixit {
    private static int x = 12;
    private static int y = 28;
    private static int z = 3;

    public static void main(String[] args) {
        System.out.println("The answer to (x * y) / 3 is "+ calculate());

    }

    private static double calculate() {
        double calculate = (x * y) / z;
        return calculate;
    }
}
