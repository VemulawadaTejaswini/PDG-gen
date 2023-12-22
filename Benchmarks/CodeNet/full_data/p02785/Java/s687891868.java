//package atcoder;
 
import java.util.*;
import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		//long H[] = new long[N];
		ArrayList<Long> list = new ArrayList<Long>();
		for(int i=0;i<N;i++) {
			list.add(sc.nextLong());
		}
		if(K>=N) {
			System.out.println(0);
			System.exit(0);
		}
		
		list.sort(Comparator.reverseOrder());
		
		
		
		for(int j=0;j<K;j++) {
		    list.set(j,(long)0);
		}
		long souwa2 = 0;
		for(int k=0;k<N;k++) {
			long a = list.get(k);
			souwa2 += a;
		}
		System.out.println(souwa2);
					
		}
}