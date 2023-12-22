import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int prev = 0;
		int diff = 0;
		boolean first = true;
		int ans = 1;
		for(int i=0;i<N;i++) {
			int d = in.nextInt();
			if(first) {
				prev = d;
				first = false;
				diff = 0;
				continue;
			}
			// 単調増加していたのに減った
			if(diff > 0 && !(d >= prev)) {
				ans += 1;
				diff = 0;
				prev = d;
				continue;
			}
			if(diff < 0 && !(d <= prev)) {
				ans += 1;
				diff = 0;
				prev = d;
				continue;
			}
			diff = d - prev;
			prev = d;
		}
		System.out.println(ans);
	}
}