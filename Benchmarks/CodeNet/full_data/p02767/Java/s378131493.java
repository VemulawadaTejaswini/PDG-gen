import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[n];
		double sum = 0;
		
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			sum += x[i];
		}
		
		sum /= n;
		
		int p;
		
		if (Math.ceil(sum) - sum >= sum - Math.floor(sum)){
			p = (int) Math.floor(sum);
		} else {
			p = (int) Math.ceil(sum);
		}
		
		long ans = 0;
		
		for (int i = 0; i < n; i++) {
			ans += Math.pow(x[i] - p, 2);
		}
		
		System.out.println(ans);
		
		sc.close();
    }
}

