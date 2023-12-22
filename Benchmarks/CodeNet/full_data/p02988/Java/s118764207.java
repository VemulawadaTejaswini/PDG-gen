import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		int result=0;

		for (int i = 0; i < n; i++) {
			int p= sc.nextInt();
			list.add(p);
		}

		for (int i = 1; i < n-1; i++) {
			int pi =list.get(i);
			int pIminus =list.get(i-1);
			int pIplus =list.get(i+1);
			// System.out.println("i " + i);
			// System.out.println("pi " + pi);
			if((pIminus<pi && pi<pIplus)|| (pIplus<pi&& pi<pIminus)){
				result++;
			}
		}

			System.out.println(result);

	}

}
