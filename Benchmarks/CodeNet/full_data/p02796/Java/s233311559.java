import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Long> all = new HashSet<>();
				long n = sc.nextLong();
				long count = 0;

			for(int i=0; i<n; i++) {
			long x = sc.nextLong();
			long l = sc.nextLong();
			long a = 0;
			long flag = all.size();
			int j=0;
			for(j=1; j<=2*l-1; j++) {
				
				all.add(x-l+j);
				
			}
				a = j-1;
				if(all.size()!=flag+a) {
					count++;
				}
		}
		System.out.println(n-count);
	}

}
