

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;


public class Main {
	
	static int n;
	static int[] a;
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	    BufferedReader in = new BufferedReader(reader);
		
		String s = in.readLine();
		n = Integer.parseInt(s);
		
		a = new int[n];
		
		s = in.readLine();
		String[] as = s.split(" ");
		
		for (int i=0; i < n; i++) {
			int input = Integer.parseInt(as[i]);
			a[i] = input;
		}
		System.out.println(solve());
	}
	


	private static String solve() {
		int max = 0;
		int c = 0;
		int left=0;
		int right=0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i>j) {
					c = comb(a[i],a[j]);
					if(max < c) {
						max=c;
						left = a[i];
						right = a[j];
						c=0;
					}
				}
			}
		}
		if(left>right) {
			return left + " " + right;
		} else {
			return right + " " + left;
		}
		
	}



	private static int comb(int a, int b) {
		// TODO Auto-generated method stub
		
		long child = 1;
		long mom = 1;
		for(int i = 0; i < b; i++) {
			child *= (a-i);
			mom *= (b-i);
		}
		if(mom == 0) return 1;
		return (int)(child/mom);
	}

	
	
}