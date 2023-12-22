import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int w = scanner.nextInt();
		int h = scanner.nextInt();
		long[] p = new long[w];
		long[] q = new long[h];
		for(int i = 0; i < w; ++i)
			p[i] = scanner.nextLong();
		for(int i = 0; i < h; ++i)
			q[i] = scanner.nextLong();
		Arrays.sort(p);
		Arrays.sort(q);
		int r = 0, c = 0;
		int wi = 0, hi = 0;
		long cost = 0;
		long size = 1L * (w+1L) * (h+1L) - 1L;
		for(long i = 0; i < size; ){
			if(wi == w){
				long num = w+1-r;
				cost += q[hi] * num;
				break;
			}
			if(hi == h){
				long num = h+1-c;
				cost += p[wi] * num;
				break;
			}
			if(p[wi] < q[hi]){
				long num = h+1-c;
				cost += p[wi] * num;
				i += num;
				r++;
				wi++;
			}else{
				long num = w+1-r;
				cost += q[hi] * num;
				i += num;
				c++;
				hi++;
			}
		}
		System.out.println(cost);
		scanner.close();
	}

}
