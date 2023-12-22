import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        long cnt = 0;
        for(int b = k+1; b <= n; b++) {
        	if(k == 0)
        		cnt += (b - k) * (n / b) + Math.max((n % b) - k, 0);
        	else
        	    cnt += (b - k) * (n / b) + Math.max((n % b) - k + 1, 0);
    	}
        System.out.println(cnt);

    }
}

