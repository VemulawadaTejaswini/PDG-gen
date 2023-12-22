
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*Atcoder用
 * 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		int a = Integer.parseInt(tmp[0]);
		int b = Integer.parseInt(tmp[1]);
		int c = Integer.parseInt(tmp[2]);


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String get = br.readLine();
		char[] s = get.toCharArray();
		for(char c:s)System.out.println(c);
 */

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str);

		List<Long> als = new ArrayList<Long>();
		String[] tmp = br.readLine().split(" ");
		for (int n = 0; n < N; n++) {
			als.add((long)Integer.parseInt(tmp[n]));
		}
		int sum = 0;
		for(int i = 0;i<als.size();i++){
			sum += als.get(i)-1;
		}

		System.out.println(sum);
	}

	static long gcd (long a, long b) {
		long temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}


	//最小公倍数lcm
	private static long lcm(long m, long n) {
	    long tmp =  m  / gcd(m, n);
	    return tmp*n;
	}
}
