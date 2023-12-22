
import java.io.PrintWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = Integer.parseInt(sc.next());
		long t[] = new long[N];
		for(int i=0;i<N;i++){
			t[i] = Long.parseLong(sc.next());
		}
		long tmp = 1;
		for(int i=100;i<N;i++){
			tmp = (tmp* t[i]) / gcd(tmp,t[i]);
		}

		out.println(tmp);
		
		sc.close();
		out.flush();
	}

	public static long gcd(long a, long b){
		if(a < b){
			return gcd(b,a);
		}
		if(b == 0){
			return a;
		}
		return gcd(b, a%b);
	}
}