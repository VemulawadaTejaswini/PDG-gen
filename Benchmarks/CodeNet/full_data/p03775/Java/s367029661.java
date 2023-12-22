import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();

		Set<Long> x = new HashSet<>();
		
		if(N % 2 == 0) {
			for(long i = 1; i <= N / 2; i++) {
				if(N % i == 0) {
					if(x.contains(i)) {
						break;
					} else {
						x.add(i);
						x.add(N / i);
					}
				}
			}
		} else {
			for(long i = 1; i <= (N + 1) / 2 ; i++) {
				if(N % i == 0) {
					if(x.contains(i)) {
						break;
					} else {
						x.add(i);
						x.add(N / i);
					}
				}
			}
		}
		
		int min = 100;
		
		Set<Long> y = new HashSet<>();
		
		for(Long i : x) {
			if(y.contains(i)) {
				break;
			}
			String a = String.valueOf(i);
			String b = String.valueOf(N / i);
			int temp = Math.max(a.length(), b.length());
			min = Math.min(min, temp);
			y.add(i);
			y.add(N / i);
		}
		System.out.println(min);
	}
}
