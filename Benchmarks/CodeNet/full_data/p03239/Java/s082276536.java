import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int[] c = new int[N];
		int[] t = new int[N];
		int p = 1001;
		for (int i = 0; i < N; i++) {
			c[i] = sc.nextInt();
			t[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			if ((t[i] <= T) && (c[i] < p)) {
				p = c[i];
			}
		}
		if (p == 1001) {
			System.out.println("TLE");
		}else{
			System.out.println(p);
		}
	}
}