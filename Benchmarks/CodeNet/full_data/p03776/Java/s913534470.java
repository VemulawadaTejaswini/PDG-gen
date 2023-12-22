import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); //個数
		int A = scanner.nextInt(); //A < m < B  ; m個のものを選ぶ
		int B = scanner.nextInt();
		List<Long> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(scanner.nextLong());
		}
		Collections.sort(list);
		Collections.reverse(list);
		long sum = 0;
		for (int i = 0; i < A; i++) {
			sum += list.get(i);
		}
		double k = ((double) sum) / A;
		System.out.printf("%.6f\n", k);
		long a = list.get(A - 1);

		// おんなじ数字がいくつあるか
		int count = (int) list.stream().filter(e -> e == a).count();
		int first = 0;
		for (int i = 0; i < N; i++) {
			if (a == list.get(i)) {
				first = i;
				break;
			}
		}
		if (first == 0) {
			long total = 0;
			for (int i = A; i <=  B; i++) {
				if (list.get(i - 1) != a) {
					break;
				}
				total += aCb(count, A - first + i - 1);
			}
			System.out.println(total);
		}else {
			//含まれている数
			int h = A - first + 1;
			System.out.println(aCb(count, count - h));
		}
	}
	
	public static long aCb(int a, int b){
		long ans = 1;
		for (int i = 0; i < b; i++) {
			ans = ans * (a - i) / (i + 1);
		}
		return ans;
	}
	static long calcCombination( int n, int m ) {
        if( n < m || m < 0 ) {
            throw new IllegalArgumentException( "引数の値が不正です ( n : " + n + ", m : " + m + ")" );
        }
        long c = 1;
        m = ( n - m < m ? n - m : m );
        for( int ns = n - m + 1, ms = 1; ms <= m; ns ++, ms ++ ) {
            c *= ns;
            c /= ms;
        }
        return c;
    }
}
