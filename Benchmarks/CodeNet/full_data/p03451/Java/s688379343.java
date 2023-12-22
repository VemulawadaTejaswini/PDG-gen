import java.util.*;
import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int[] top = new int[n];
		int[] bot = new int[n];
		String[] r = in.readLine().split("\\s++");
		for(int i = 0; i < n; i++) {
			top[i] = Integer.parseInt(r[i]);
		}
		r = in.readLine().split("\\s++");
		for(int i = 0; i < n; i++) {
			bot[i] = Integer.parseInt(r[i]);
		}
		for(int i = 1; i < n; i++) {
			top[i] += top[i-1];
		}
		for(int i = n - 2; i >= 0; i--) {
			bot[i] += bot[i+1];
		}
		int best = 0;
		for(int i = 0; i < n; i++) {
			if(top[i] + bot[i] > best) best = top[i] + bot[i];
		}
		System.out.println(best);
	}
}