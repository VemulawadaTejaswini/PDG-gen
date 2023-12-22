import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(in.readLine());
		String[] s = in.readLine().split("\\s++");
		int min = 2;
		int max = 3;
		int v;
		int t;
		boolean broke = false;
		for(int i = s.length - 1; i >= 0; i--) {
			v = Integer.parseInt(s[i]);
			if(i == s.length - 1) {
				if(v != 2) broke = true;
			} else {
				if(v > max) broke = true;
				if(v < min) {
					
					min = min - (min % v) + (min % v == 0 ? 0 : v);
					if(min > max) broke = true;
				} else {
					min = v;
				}
				if(min > max) broke = true;
				max = max - (max % v) + v - 1;
			}//System.out.println(min + " m:M " + max);
			//if(broke)System.err.println("break");
		}
			if(broke) System.out.println(-1);
			else System.out.print(min + " " + max);
	}
}