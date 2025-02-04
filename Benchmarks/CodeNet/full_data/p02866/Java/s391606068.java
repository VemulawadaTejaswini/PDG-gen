import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		Integer N = Integer.parseInt(sc.next());
		int[] D = new int[N];
		boolean b =false;
		int now =0;
		for(int i=0;i<N;i++) {
			D[i] = Integer.parseInt(sc.next());
			if(i != 0) {
				if(D[i] ==0 && !b) {
					out.println(0);
					b = true;
				}
			}
			if(D[0] != 0 && !b) {
				out.println(0);
				b =true;
			}
		}
		Arrays.sort(D);
		int count_prev = 1;
		int count = 1;
		long result = 1;
		for(int i=0;i<N-1;i++) {
			if(D[i] == D[i+1]) {
				count++;
			}
			else {
				result *= (long)(Math.pow(count_prev, count))%998244353;
				result = result % 998244353;
				count_prev = count;
				count = 1;
				now++;
			}
			if(i==N-2) {
				result *= (long)(Math.pow(count_prev, count))%998244353;
				result = result % 998244353;
			}
			if(now!=D[i]) {
				b = true;
			}
		}
		if(!b) {out.println(result);}
		else {
			out.println(0);
		}
		
		out.flush();
	}
}