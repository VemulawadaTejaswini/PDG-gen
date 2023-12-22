
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long L = scanner.nextLong();
        long R = scanner.nextLong();


        long modL = mod2019(mod2019(L));
        long modR = mod2019(mod2019(R));

        long nextMod0Number = (L + 2019 - modL);

        if (nextMod0Number < R) {
            System.out.println(mod2019((nextMod0Number * (nextMod0Number + 1))));
        } else if (nextMod0Number == R) {
            System.out.println(mod2019(R + nextMod0Number));
        } else {
            System.out.println(mod2019(L * (L + 1)));
        }
    }

    private static long mod2019(long hoge) {
        return hoge % 2019;
    }
}