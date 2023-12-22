import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long p = sc.nextLong();
        int m = (int) Math.ceil(Math.sqrt(p));
        long ans = 1;
        for (int i = 2; i < m; i++) {
            int cnt = 0;
            while(p % i == 0){
                cnt++;
                p /= i;
            }
            if(n <= cnt){
                ans *= Math.pow(i, (cnt / n));
            }
        }
        if(1 < p) ans *= p;
        System.out.println(ans);
        sc.close();

    }

}
