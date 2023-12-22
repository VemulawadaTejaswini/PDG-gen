import java.math.BigInteger;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), count[] = new int[26];
        for (char c : scanner.next().toCharArray())
            count[c - 'a']++;
        BigInteger ans = BigInteger.ONE;
        for (int i = 0; i < 26; i++)
            ans = ans.multiply(BigInteger.valueOf(count[i] + 1));
        System.out.println(ans.subtract(BigInteger.ONE).remainder(BigInteger.valueOf(1000000007)));
    }
}