import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {
                int tmp = (int)gcd(i,j);
                for (int l = 1; l <= k; l++) {
                    int num = (int)gcd(tmp,l);
                    sum += num;
                }
            }
        }
        System.out.println(sum);
    }
    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}

