import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N+1];

		for(int i=1;i<=N;i++) {
			a[i] = sc.nextInt();
		}

		int[] b = new int[N+1];
		List<Integer> balli = new ArrayList<>();
		for(int i=N;i>0;i--) {

			int iball = 0;
			for(int k=2;k*i <= N;k++) {
				iball += b[k*i];
			}

			if(iball % 2 == a[i]) {
				b[i] = 0;
			}else {
				b[i] = 1;
				balli.add(i);
			}
		}

		System.out.println(balli.size());
		for(int i=balli.size()-1;i>=0;i--) {
			System.out.println(balli.get(i));
		}
	}
}
