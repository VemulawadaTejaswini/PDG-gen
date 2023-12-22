import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n+1];
		boolean[] red = new boolean[n+1];
		red[1] = true;
		for(int i = 1; i <= n; i++) {
			a[i] = 1;
			if(i != 1) {
				red[i] = false;
			}
		}
		for(int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(red[x]) {
				if(a[x] == 1) {
					red[x] = false;
				}
				a[x]--;
				red[y] = true;
				a[y]++;
			}
		}
		int ans = 0;
		for(int i = 1; i <= n; i++) {
			if(red[i]) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
