
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] as = new long[N];
		Set<Long> reslist = new HashSet<Long>();
		for (int i = 0; i < N; i++) {
			if (sc.hasNext()) {
				as[i] = sc.nextLong();
				
				for (int j = 0; j < i; j++) {
					long r;
					long a = as[i];
					long b = as[j];
					while(b > 0) {
						r = a%b;
						a = b;
						b = r;
					}
					if (!reslist.contains(a)) {
						reslist.add(a);
					}
				}
			}
		}
		
		Long result = 1l;
		
		for (Long integer : reslist) {
			int count = 0;
			for (int i = 0; i < N; i++) {
				if (as[i]%integer == 0) {
					count++;
				}
			}
			if (count == N || count == N-1) {
				if (integer > result) {
					result = integer;
					
				}
			}
		}
		System.out.println(result);
	}
	
}