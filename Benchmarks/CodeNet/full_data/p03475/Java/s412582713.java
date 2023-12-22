import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] costs = new int[n];
		int[] seconds = new int[n];
		int[] fulls = new int[n];
		for (int i = 0; i < n - 1; i++) {
		    costs[i] = sc.nextInt();
		    seconds[i] = sc.nextInt();
		    fulls[i] = sc.nextInt();
		}
		int[] times = new int[n];
		for (int i = 0; i < n - 1; i++) {
		    for (int j = 0; j <= i; j++) {
		        if (times[j] < seconds[i]) {
		            times[j] = seconds[i] + costs[i];
		        } else {
		            int d = (times[j] + fulls[i] - 1) / fulls[i];
		            times[j] = fulls[i] * d + costs[i];
		        }
		    }
		}
		
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    sb.append(times[i]).append("\n");
		}
     System.out.println(sb);
	}
}
