import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        long a = 1;
        for(long i = 2; i * i <= n; i++) {
            if(n % i != 0) continue;
                
            if(Math.abs(i - n/i) < Math.abs(a - n/a))
                a = i;
        }
		System.out.println(Math.max(count(n/a), count(a)));
    }
    
    private static int count(long A) {
        int cntA = 0;
        while(A > 0) {
            cntA++;
            A /= 10;
        }
        return cntA;
    }
}
