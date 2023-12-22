import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] array = new long[N];
		List<Long> list = new ArrayList<Long>();
		long cnt = 0;
		for (int i=0; i<N; i++) {
			long A = sc.nextLong();
			array[i] = A;
			list.add(A);
		}
		Collections.sort(list);
		for (int i=0; i<N; i++) {
			int j = list.indexOf(array[i]);
			if ((i+j)%2==1) cnt++;
		}
		System.out.println((long)((cnt+1)/2));
		sc.close();
	}

}
