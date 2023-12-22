import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long min = Math.min(a, b);
        long max = Math.max(a, b);
        if (min == 1) {
            System.out.println(1);
            return;
        }
        long gcd = gcd(min, max);
        long cnt = 2;// 1と2
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 3; i <= gcd; i += 2) {
            if (min % i == 0) {
                list.add(i);
            }
        }
        list.removeIf(i -> {
            return (max % i != 0);
        });
        for (Integer i : list) {
            if (IsPrime(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static long gcd(long m, long n) {
        if (m < n)
            return gcd(n, m);
        if (n == 0)
            return m;
        return gcd(n, m % n);
    }

    static boolean IsPrime(int n) {
        double sqrtNum = Math.sqrt(n);
        for (int i = 3; i <= sqrtNum; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
