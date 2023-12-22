import java.io.PrintWriter;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = Integer.parseInt(sc.next());
		int Ma = Integer.parseInt(sc.next());
		int Mb = Integer.parseInt(sc.next());

		int[] a = new int[N];
		int[] b = new int[N];
		//key is cost, value is id number.
		TreeMap<Integer,Integer> c = new TreeMap<>();
		for(int i=0;i<N;i++) {
			a[i] = Integer.parseInt(sc.next());
			
			b[i] = Integer.parseInt(sc.next());
			
			c.put(i,Integer.parseInt(sc.next()));
		}


		//using material from 0 to i, ratio is (a,b), mean cost.
		int[][] dp = new int[Ma][Mb];
		for(int j=0;j<Ma;j++) {
			for(int k=0;k<Mb;k++) {
				dp[j][k] = Integer.MAX_VALUE;
			}
		}
		dp[0][0] = 0;

		Entry<Integer,Integer> ins  = c.pollFirstEntry();
		int m;
		int id = ins.getValue();

		int a_mod = a[id];
		int b_mod = b[id];
		while(a_mod!=0&&b_mod!=0&&c.size()>0){
			ins = c.pollFirstEntry();
			m = ins.getKey();
			id = ins.getValue();


			a_mod = (a_mod + a[id]) % Ma;
			b_mod = (b_mod + b[id]) % Mb;

			if(dp[a_mod][b_mod] == Integer.MAX_VALUE || dp[a_mod][b_mod] == 0) {
				dp[a_mod][b_mod] = dp[(Ma + a_mod - a[id])%Ma][(Mb + b_mod - b[id]) % Mb] + c.get(id);
			}
		}
		if(dp[0][0] == 0) {
			out.println(-1);
		}
		else {
			out.println(dp[0][0]);
		}

		out.flush();
	}
}