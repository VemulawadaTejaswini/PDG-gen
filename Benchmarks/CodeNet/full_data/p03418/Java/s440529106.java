import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int cnt = 0;
        for(int b = k+1; b <= n; b++) {
        	int p = n / b;
        	if(k > 0)
        		cnt += Math.max(b - k, 0) * p + Math.max((n % b) - k + 1, 0);
        	else
        		cnt += Math.max(b, 0) * p + Math.max((n % b), 0); 
    	}
        System.out.println(cnt);
    }
}
