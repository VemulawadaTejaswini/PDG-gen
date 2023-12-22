import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        long a = 1;
        
        for(long i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                if(Math.abs(i - n/i) < Math.abs(a - n/a))
                    a = i;
            }
        }
        int cntA = 0;
        long A = a;
        while(A > 0) {
            cntA++;
            A /= 10;
        }
        
        int cntN = 0;
        long N = n/a;
        while(N > 0) {
            cntN++;
            N /= 10;
        }
		System.out.println(Math.max(cntN, cntA));
    }
    
}
