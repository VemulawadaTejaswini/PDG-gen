import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] x = new int[n];
		for(int i = 0; i < n; i++)
			x[i] = sc.nextInt();
		int answer = 1000000000;
		if(n == k) {
			answer = 0;
			if(x[0] < 0) {
				answer -= x[0]; 
				if(x[n-1] > 0)
					answer += x[n-1];
			}
			else
				answer += x[n-1];
		}
		else {
			int[] distance = new int[n-k];
			for(int i = 0; i < n-k; i++) {
				distance[i] = Math.abs(x[i+k-1]-x[i]);
				distance[i] += Math.min(Math.abs(x[i+k-1]), Math.abs(x[i]));
			}
			for(int i = 0; i < n-k; i++)
				answer = Math.min(answer, distance[i]);
		}
		System.out.println(answer);
	}

}
