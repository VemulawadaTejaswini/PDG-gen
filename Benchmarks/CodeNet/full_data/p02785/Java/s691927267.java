import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K= Integer.parseInt(sc.next());
		List<Integer> list = new ArrayList();
		for(int i=0; i<N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		Collections.sort(list);
//		Collections.reverse(list);
		if(list.size() <= K) {
			System.out.println(0);
			return;
		}
//		for(int i=0; i<K; i++) {
//			list.remove(i);
//		}
		Long count = 0L;
		for(int i=0; i< N-K; i++) {
			count += list.get(i);
		}
		System.out.println(count);

	}
}
