public class GreatestCommonRemainder {
    private long tmpA = 2500;
    private long tmpB = 500;

    public static void main(String[] args) {
        GreatestCommonRemainder gcdCalculator = new GreatestCommonRemainder();
        long result = gcdCalculator.gcd(gcdCalculator.tmpA, gcdCalculator.tmpB);
        System.out.print("RESULT: "+result);
    }

    public static long gcd(long a, long b) {
        while (b > 0) {
            long temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }
}
