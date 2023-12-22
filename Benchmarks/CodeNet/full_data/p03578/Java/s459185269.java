import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;
		String[] input;
		int i, j;
		int N, M;
		HashMap<Integer, Integer> D = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> T = new HashMap<Integer, Integer>();
		int max = 0;
		int ans = 0;
		int d, t;
		
		N = Integer.parseInt(br.readLine());
		buf = br.readLine();
		input = buf.split(" ");
		for(i=0;i<N;i++) {
			d = Integer.parseInt(input[i]);
			if(D.containsKey(d)) {
				D.put(d, D.get(d) + 1);
			} else {
				D.put(d,  1);
			}
		}
		M = Integer.parseInt(br.readLine());
		buf = br.readLine();
		input = buf.split(" ");
		for(i=0;i<M;i++) {
			t = Integer.parseInt(input[i]);
			if(D.containsKey(t) && D.get(t) > 0) {
				D.put(t, D.get(t) - 1);
			} else {
				System.out.println("NO");
				return;
			}
		}
		
		System.out.println("YES");
	}
}
