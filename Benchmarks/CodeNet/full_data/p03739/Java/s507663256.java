
import java.util.Scanner;

public class Main {
	
	public static double sequence(int a[], double start) {
		double count = 0.0, presum = -1.0 * start, sum = 0.0;
		
		for(int i : a) {
			sum += (double)i;
			if(i == 0)sum += start;
			if(sum * presum > 0) {
				double min = Math.abs(sum) + 1;
				if(presum > 0)sum -= min;
				else sum += min;
				count += min;
			}
			
			if(sum == 0) {
				if(presum > 0)sum--;
				else sum++;
				++count;
			}
			
			presum = sum;
		}
		
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, a[];
		double count = 0;
		
		n = sc.nextInt();
		a = new int[n];
		
		for(int i = 0; i < n; ++i) a[i] = sc.nextInt();
		
		sc.close();
		
		count = Math.min(sequence(a, (double)a[0]),sequence(a, -1.0 * a[0]));
		
		System.out.printf("%.0f\n", count);
	}

}
