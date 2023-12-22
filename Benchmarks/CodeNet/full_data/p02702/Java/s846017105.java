import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int len = S.length();
        BigInteger _2019 = new BigInteger("2019");

        int ans = 0;
        for (int i = 0; i < len; i ++) {
            for (int j = i + 3; j <= len; j ++) {
                if (new BigInteger(S.substring(i, j)).mod(_2019).equals(BigInteger.ZERO)) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}