import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		boolean[] red = new boolean[n];
		red[0] = true;
		for(int i = 0; i < n; i++) {
			a[i] = 1;
			if(i != 0) {
				red[i] = false;
			}
		}
		for(int i = 0; i < m; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			if(red[x]) {
				if(a[x] == 1) {
					a[x]--;
					red[x] = false;
				} else {
					a[x]--;
				}
				red[y] = true;
				a[y]++;
			}
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
