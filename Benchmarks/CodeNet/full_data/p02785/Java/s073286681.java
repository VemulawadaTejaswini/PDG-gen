import java.math.*;
import java.util.*;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int k = sc.nextInt();
			List<Integer> H = new ArrayList<Integer>();
			
			for(int i=0;i<n;i++) {
				H.add(sc.nextInt());
			}
			
			Collections.sort(H);
			
			int res = 0;
			
			for(int i=0;i<=n-k;i++) {
				res += H.get(i);
			}
			
			System.out.println(res);
			
		}

	}