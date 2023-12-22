import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		List<Long> AList = new ArrayList<>();
		List<Long> seki = new ArrayList<>();
		
		for (int i=0; i<N; i++) {
			long A = sc.nextLong();
			for (Long a : AList) {
				seki.add(a * A);
			}
			AList.add(A);
		}
		
		Collections.sort(seki);

		System.out.println(seki.get(K - 1));
	}
}