import java.math.*;
import java.util.*;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int k = sc.nextInt();
			List<BigInteger> H = new ArrayList<BigInteger>();
			
			for(int i=0;i<n;i++) {
				H.add(sc.nextBigInteger());
			}
			
			Collections.sort(H);
			
			BigInteger res = BigInteger.ZERO;
			
			for(int i=0;i<=n-k;i++) {
				res=res.add(H.get(i)) ;
			}
			
			System.out.println(res);
			
		}

	}