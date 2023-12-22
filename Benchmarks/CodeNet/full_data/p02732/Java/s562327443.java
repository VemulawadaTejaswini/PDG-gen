import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// https://atcoder.jp/contests/abc159/tasks/abc159_d
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		HashMap<String, Integer> map = new HashMap<>();
		String[] arrayA = new String[N];
		for (int i = 0; i < N; i++) {
			arrayA[i] = sc.next();
			String str = arrayA[i];
			if (map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			} else {
				map.put(str, 1);
			}
		}
		sc.close();



		int[] array1 = new int[N];
//		int[] array2 = new int[N];
		int i = 0;
		for (Map.Entry<String, Integer> bar : map.entrySet()) {
			int a = bar.getValue();
			array1[i] = a*(a-1)/2;
//			if(a!=0) {
//				array2[i] = (a-1)*(a-2)/2;
//			}
		}

		int ans1 = 0;
		for(int j:array1) {
			ans1 = ans1 + j;
		}

//		for(int k=0;k<N;k++) {
//			String number = arrayA[k];
//			int aa = Integer.parseInt(number);
//
//		}



		for(int k=0;k<N;k++) {
			int ans = ans1;
			String number = arrayA[k];
			int a = map.get(number);
			if(a!=0) {
				ans = ans - a*(a-1)/2 + (a-1)*(a-2)/2;
			}

			System.out.println(ans);

		}
	}
}
