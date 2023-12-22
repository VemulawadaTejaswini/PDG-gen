import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		List<Integer> A = new ArrayList<>();
		for(int i=0; i<N; i++) {
			A.add(sc.nextInt());
		}
		sc.close();
		if(N<=K) {
			System.out.println(0);
			return;
		}
		Collections.sort(A,  Collections.reverseOrder());
		for(int i=0; i<K; i++) {
				A.remove(i);
		}
		long s = 0;
		for(int i=0; i<A.size(); i++) {
			s+=A.get(i);
		}
		System.out.println(s);
	}

}