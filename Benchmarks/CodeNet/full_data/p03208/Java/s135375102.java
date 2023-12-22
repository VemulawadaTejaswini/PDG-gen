import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),k = sc.nextInt();
		int[] h = new int[n];
		int[] d = new int[n-k+1];
		for(int i = 0;i < n;i ++) {
			h[i] = sc.nextInt();
		}
		Arrays.sort(h);
		for(int i = 0;i <= n - k;i++) {
			//System.out.println(h[i+k-1]+" " +h[i]);
			d[i] = h[i+k-1] - h[i];
			//System.out.println(d[i]);
		}
		Arrays.sort(d);
		System.out.println(d[0]);
	}
}