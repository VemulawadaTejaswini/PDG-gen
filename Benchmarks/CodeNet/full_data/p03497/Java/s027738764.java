import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(sc.next());
		}

		sc.close();

		HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();
		for(int i = 0; i<N; i++) {
			if(list.containsKey(A[i])) {
				int num = list.get(A[i]) + 1;
				list.put(A[i], num);
			}else {
				list.put(A[i], 1);
			}
		}

		if(list.size() <= K) {
			System.out.println(0);
		}else {
			int sa = list.size() - K;
			int answer = 0;
			for(int i = 1; i <= 200000; i++) {
				if(list.containsValue(i)) {
					answer += i;
					sa--;
				}else {
					continue;
				}

				if(sa == 0) {
					System.out.println(answer);
					break;
				}
			}

		}

	}



}
