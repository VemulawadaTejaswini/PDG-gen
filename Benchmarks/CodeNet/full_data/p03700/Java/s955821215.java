import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static long a, b, h[];
	
	/*rより小さいenough()をみたす値の最大値を返す
	 * なければー１を返す*/
	public static long halflower(long r, long l) {		
		long m;
		
		while(l < r) {
			m = (r + l) / 2;
			if(r - l <= 1) {
				if(enough(m + 1))return m + 1;
				else return m;
			}
			else {
				if(enough(m))r = m;
				else l = m;
			}
		}
		
		if(enough(0))
		return 0;
		else return -1;
	}
	
	
	public static boolean enough(long t) {
		long count = 0, tmp = 0;
		int n = h.length;
		
		for(int i = 0; i < n; ++i) {
			tmp = h[i] - b * t;
			if(tmp > 0)count += Math.ceil((double)tmp / (double)(a - b));
		}
		if(count <= t)return true;
		else return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		long count;
		n = sc.nextInt();
		a = sc.nextLong();
		b = sc.nextLong();
		h = new long[n];
		for(int i = 0; i < n; ++i)h[i] = sc.nextLong();
		sc.close();
		
		Arrays.sort(h);
		count = halflower(h[n - 1] / b, 0);
		
		
		System.out.println(count);
	}

}
