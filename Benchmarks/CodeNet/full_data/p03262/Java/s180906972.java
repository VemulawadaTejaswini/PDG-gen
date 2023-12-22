import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long X = sc.nextLong();
        ArrayList<Long> x = new ArrayList<>(); 
        ArrayList<Long> diff = new ArrayList<>(); 

        long result = sc.nextLong();
        for (int i = 1; i<N; i++) {
            result = calcBGF(result, Math.abs(X-sc.nextLong()));
        }

        System.out.println(result);
    }

    static long calcBGF(long x, long y) {
        if (x > y) {
            return calcBGF(y, x);
        }

        if (x == 0) {
            return y;
        }

        return calcBGF(x, y - x);
    }
}
