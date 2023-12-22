import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> all = new HashSet<>();
				int n = sc.nextInt();
				int count = 0;

			for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int l = sc.nextInt();
			int a = 0;
			int flag = all.size();
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
