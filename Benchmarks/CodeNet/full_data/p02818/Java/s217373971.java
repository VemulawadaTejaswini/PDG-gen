import java.util.*;

public class Main {
    static int MOD = 1000000007;
	static int INF = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        Long b = sc.nextLong();
        Long k = sc.nextLong();

        if (a >= 1 && a >= k) {
            a = a - k;
        } 
        if (a >= 1 && a < k) {
            k = k - a;
            a = (long)0;
            b = b - k;
        }
        
        System.out.println(a + " " + b);
    }
}