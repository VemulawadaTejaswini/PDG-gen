import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		long[] A = new long[L];
		for(int i = 0; i < L; i++) {
			A[i] = sc.nextLong();
		}
		sc.close();
		long c = 0;
		long sum = 0;
		List<Long> list = new ArrayList<Long>();
		long ans = 0;
		for(int i = 0; i < L; i++) {
			if(A[i] == 0) {
				c++;
				list.add(A[i]);
				if(sum <= c) {
					ans += sum;
					sum = 0;
					c = 0;
					list.clear();
				}
			}else {
				sum += A[i];
				list.add(A[i]);
			}
		}
		List<Long> li = new ArrayList<Long>();
		int idx0 = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) != 0) {
				break;
			}else {
				idx0 = i;
			}
		}
		int idx1 = li.size() - 1;
		for(int i = list.size() - 1; i >= 0; i--) {
			if(list.get(i) != 0) {
				idx1 = i;
				break;
			}else {
				idx1 = i;
			}
		}
		for(int i = idx0; i <= idx1; i++) {
			li.add(list.get(i));
		}
		if(li.size() == 1) {
			System.out.println(ans);
			System.exit(0);
		}
		long[] e = new long[li.size() - 1];
		for(int i = 0; i < li.size(); i++) {
			if(li.get(i) == 0) {
				ans++;
			}
		}
		for(int i = 0; i < li.size() - 1; i++) {
			e[i] = Math.abs(li.get(i + 1) - li.get(i));
		}
		for(long i : e) {
			if(i % 2 == 0) {
				ans++;
				break;
			}
		}
		System.out.println(ans);
	}
}