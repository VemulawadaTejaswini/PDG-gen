import java.util.*;
public class Main {
	
	public static long gcd(long a, long b) {
		return b == 0 ? a: gcd(b, a % b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = gcd(A, B);
		int n = 1000000;
		List<Integer> p = new ArrayList<>();
		p.add(1);
		p.add(2);
		p.add(3);
		for(int i = 5; i <= Math.sqrt(C); i += 2) {
			boolean isp = true;
			for(int j = 2; j*j <= i; j++) {
				if(i % j == 0) {
					isp = false;
					break;
				}
			}
			if(isp)
				p.add(i);
		}
		Set<Integer> cd = new HashSet<>();
		for(int i : p) {
			if(i > Math.sqrt(A))
				break;
			if(C % i == 0)
				cd.add(i);
		}
		System.out.println(cd.size());

	}

}
