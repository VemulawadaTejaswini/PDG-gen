import java.math.*;
import java.util.*;

public class Main {
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l[] = new int[n];
        int GCD = 0;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (i == 0){
                GCD = tmp;
                continue;
            }
            GCD = gcd(GCD, tmp);
        }
        int cnt = 0;
        while (GCD % 2 == 0) {
            GCD/=2;
            cnt++;
        }
        
        
        System.out.println(cnt);
    }
}
