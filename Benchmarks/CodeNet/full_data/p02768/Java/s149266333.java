
import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        long kind = scanner.nextLong();
        int forbbiden1 = scanner.nextInt();
        int forbbiden2 = scanner.nextInt();
        double nfact = fact(kind);
        double rfact = 1;
        double nrfact = 1;
        double ans = 0;
        for (double r = 1; r < kind ; r++) {
            rfact = fact(r);
            nrfact = fact(kind - r);
            ans += nfact / (rfact * nrfact);
        }
        ans += 1;
        nfact = fact(forbbiden1);
        rfact = 1;
        nrfact = 1;
        for (double r = 1; r < forbbiden1 ; r++) {
            rfact = fact(r);
            nrfact = fact(forbbiden1 - r);
            ans -= nfact / (rfact * nrfact);
        }
        ans -= 1;
        nfact = fact(forbbiden2);
        rfact = 1;
        nrfact = 1;
        for (double r = 1; r <= forbbiden2 ; r++) {
            rfact = fact(r);
            nrfact = fact(forbbiden2 - r);
            ans -= nfact / (rfact * nrfact);
        }
        ans -= 1;
        System.out.println(ans % 1000000007);
    }
    static double fact(double n) {
        double nfact = 1;
        for(double i = 1; i <= n ; i++) {
            nfact *= i;
        }
        return nfact;
    }
}
