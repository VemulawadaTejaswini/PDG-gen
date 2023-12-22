import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		boolean[] red = new boolean[n];
		Arrays.fill(a, 1);
		red[0] = true;
		for(int i = 1; i < n; i++) {
			red[i] = false;
		}
		for(int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			x--;
			y--;
			if(red[x] && !red[y]) {
				red[y] = true;
//				if(a[x] == 1) {
//					red[x] = false;
//				}
//				a[x]--;
//				red[y] = true;
//				a[y]++;
			}
			if(a[x] == 1 && red[x]) {
				red[x] = false;
			}
			a[x]--;
			a[y]++;
		}
		int ans = 0;
		for(int i = 0; i < n; i++) {
			if(red[i]) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
