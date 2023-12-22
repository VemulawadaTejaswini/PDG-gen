import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int K = sc.nextInt();

        int cnt = 0;
        for(int k = K; k < n; k++) {
        	for(int b = k+1; b <= n; b++) {
        		cnt += (n - k) / b;
        		if(k > 0) cnt++;
        	}
        }
        System.out.println(cnt);
    }
}
