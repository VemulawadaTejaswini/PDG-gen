import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BigInteger power = BigInteger.ONE;
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        BigInteger v = BigInteger.valueOf(1000000007L);
        for (int i = 2; i <= amount; i++) {
            power = power.multiply(BigInteger.valueOf(i));
        }
        System.out.println(power.remainder(v));
    }
}