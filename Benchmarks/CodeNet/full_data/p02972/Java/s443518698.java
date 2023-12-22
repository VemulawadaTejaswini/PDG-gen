import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N + 1];
		int b[] = new int[N + 1];
		for(int i = 1; i <= N; i++) {
			a[i] = sc.nextInt();
			b[i] = 0;
		}
		ArrayList<Integer> ary = new ArrayList<Integer>();
		for(int i = N; i >= 1; i--) {
			if(a[i] != b[i]) {
				ary.add(i);
				for(int j = 1; j <= Math.sqrt(i); j++) {
					if(i % j == 0) {
						if(b[j] == 0) {
							b[j] = 1;
						} else {
							b[j] = 0;
							if(j != i / j) {
								if(b[i / j] == 0) {
									b[i / j] = 1;
								} else {
									b[i / j] = 0;
								}
							}
						}
					}
				}
			}
		}
		Collections.sort(ary);
		System.out.println(ary.size());
		for(int i = 0; i < ary.size(); i++) {
			System.out.println(ary.get(i));
		}
	}
}
