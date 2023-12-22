import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n = 0;
	static int m = 0;
	
	public static void main(String[] args) {
		n = sc.nextInt();
		m = sc.nextInt();
		ArrayList<Integer> mDivisors = getSortedDivisors(m);
		int ans = 0;
		for(int i = 0; i < mDivisors.size(); ++i) {
			int div = mDivisors.get(i);
			if(div > m / n) break;
			ans = div;
		}
		System.out.println(ans);
	}
	
	static ArrayList<Integer> getSortedDivisors(int m) {
		ArrayList<Integer> divisors = new ArrayList<>();
		for(int i = 1; i * i <= m; ++i) {
			if(i * i == m) divisors.add(i);
			else if(m % i == 0) {
				divisors.add(i);
				divisors.add(m / i);
			}
		}
		Collections.sort(divisors);
		return divisors;
	}
}