import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double n = scan.nextInt();
		int total_x = 0;
		int x[] = new int[(int)n];
		for(int i=0;i<n;i++) {
			x[i] = scan.nextInt();
			total_x += x[i];
		}
		
		int ave_x = (int)Math.round(total_x/n);
		int ans = 0;
		for(int i=0;i<n;i++) {
			ans += Math.pow(x[i]-ave_x, 2);
		}
		System.out.println(ans);
		
	}
}


