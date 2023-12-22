import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Long> cd = new ArrayList<>();
    private static List<Long> result = new ArrayList<>();

    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long gcd = gcd(a, b);
        for (long i = 1; i <= gcd; i++) {
            if (a % i == 0 && b % i == 0) {
                cd.add(i);
            }
        }

        for (int i = 0; i < cd.size(); i++) {
            boolean coprime = true;
            for (int j = 0; j < result.size(); j++) {
                if (gcd(cd.get(i), result.get(j)) != 1) {
                    coprime = false;
                    break;
                }
            }
            if (coprime) {
                result.add(cd.get(i));
            }
        }
        System.out.println(result.size());
    }

}
