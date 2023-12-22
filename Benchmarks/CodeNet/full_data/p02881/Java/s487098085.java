import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Long> list = new ArrayList<>();
		long N = sc.nextLong();
		list.add(2L);
		list.add(3L);

		for(int j = 5; j * j<= N; j += 2) {
			boolean b = true;
			for(int i = 0; list.get(i) * list.get(i) <= j; i++) {
				if(j % list.get(i) == 0) {
					b = false;
				}
			}
			if(b) list.add((long)j);
		}

		int n = 1;
		int m = 1;
		int count = 0;
		for(int i = 0; i < list.size();) {
			long sosu = list.get(i);
			if(N % sosu == 0) {
				N /= sosu;
				if(count % 2 == 0) {
					n *= sosu;
					count++;
				}else {
					m *= sosu;
					count++;
				}
			}else {
				i++;
			}
		}
		if(count == 0) {
			System.out.println(N - 1);
		}else {
			System.out.println(n + m - 2);
		}

		sc.close();
	}
}
