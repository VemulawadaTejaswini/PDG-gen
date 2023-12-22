import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kindsOfFlowers = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        BigInteger modulo = BigInteger.valueOf(1000000007);

        BigInteger forCount = BigInteger.valueOf(kindsOfFlowers - 1);
        BigInteger addFirst = forCount.add(BigInteger.ONE);
        BigInteger addSecond = forCount.add(BigInteger.valueOf(2));
        BigInteger answer = forCount.multiply(addFirst).multiply(addSecond).divide(BigInteger.valueOf(6));

        if (a != 1 && b != 1) {
            answer = answer.add(BigInteger.valueOf(kindsOfFlowers));
        }

        if (a != 1) {
            answer = answer.subtract(countForOneCombination(kindsOfFlowers - a + 1));
        }
        if (b != 1) {
            answer = answer.subtract(countForOneCombination(kindsOfFlowers - b + 1));
        }
        System.out.println(answer.mod(modulo));
    }

    private static BigInteger countForOneCombination(int i) {
        BigInteger bigIntegerFirst = BigInteger.valueOf(i);
        BigInteger bigIntegerSecond = bigIntegerFirst.add(BigInteger.ONE);
        return bigIntegerFirst.multiply(bigIntegerSecond).divide(BigInteger.valueOf(2));
    }
}