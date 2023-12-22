import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int prevA = s;
 
		Set<Integer> prevFValues = new HashSet<>();
		prevFValues.add(s);
		for (int i=2; i<=1000000; i++) {
			int newA = f(prevA);
			if (prevFValues.contains(newA)) {
				System.out.println(i);
				return;
            }
			prevFValues.add(newA);
			prevA = newA;
		}
	}

	static int f(int n) {
		return (n % 2 == 0) ? (n / 2) : (3 * n + 1);
	}
}
