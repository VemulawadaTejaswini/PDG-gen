
import java.util.ArrayList;
import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long N = scn.nextLong();
		long ans = 0;
		ArrayList<Long> point = new ArrayList<Long>();

		for(long i = 1;;i++) {
			long p = i * (i+2);
			if(p>N)break;
			point.add(p);
		}
		
		for(int i = 0;i < point.size();i++) {
			long p = point.get(i);
			if((N-p)%(i+1)==0) {
				ans += (i+2)+(N-p)/(i+1);
			}
		}


		System.out.println(ans);
	}

}
