import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		List<Integer> H = new ArrayList<>();
		
		for (int i=0; i<N; i++) {
			H.add(sc.nextInt());
		}
		
		Collections.sort(H);
		long ans = 0;
		for (int i=0; i<N - K; i++) {
			ans += H.get(i);
		}
		System.out.println(ans);
	}
}