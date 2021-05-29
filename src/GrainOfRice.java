import java.math.BigInteger;

public class GrainOfRice {
    public static void main(String[] args) {
        BigInteger n = BigInteger.ZERO;
        for (int i = 1; i <= 15; i++) {
            BigInteger item = BigInteger.ONE;
            for (int j = 1; j < i; j++) {
                item = item.multiply(BigInteger.valueOf(2));
            }
            n = n.add(item);
            System.out.println(i + ":" + item);
        }
    }
}
