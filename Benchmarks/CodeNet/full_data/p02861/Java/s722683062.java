import java.util.Scanner;
 
public class Main {
 
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		int[] b = new int[n];
		double[][] distance = new double[n][n];
		double ans = 0;
		int count = 0;
		for(int i = 0 ; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
			b[i] = Integer.parseInt(sc.next());
		}
		
		for(int i = 0 ; i < n -1; i++) {
			for(int j = i + 1 ; j < n; j++) {
				double tmp_x = Math.pow((a[j] - b[i]), 2);
				double tmp_y = Math.pow((b[j] - a[i]), 2);
				double tmp = Math.sqrt(tmp_x + tmp_y);
				distance[i][j] = tmp;
				ans += tmp;
				count ++;
			}
		}
		
		
		System.out.println(ans*2/n);
		
		
	}
 
}