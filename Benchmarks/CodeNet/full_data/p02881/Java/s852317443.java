import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long minMove = Long.MAX_VALUE;
        for(long x = 1; x * x <= n; x++) {
        	if(n % x != 0) continue;
        	long y = n / x;
        	minMove = Math.min(minMove, Math.abs(x - 1) + Math.abs(y - 1));
        }
        System.out.println(minMove);
    }
}
