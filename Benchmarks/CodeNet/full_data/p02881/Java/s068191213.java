import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		ArrayList<Long> ary = new ArrayList<Long>();
		for(long i = 2; i <= Math.sqrt(N); i++) {
			while(N % i == 0) {
				ary.add(i);
				N /= i;
			}
		}
		ary.add(N);
		Collections.sort(ary);
		long num1 = 1;
		long num2 = 1;
		for(int i = ary.size() - 1; i >= 0; i--) {
			if(num1 > num2) {
				num2 *= ary.get(i);
			} else {
				num1 *= ary.get(i);
			}
		}
		System.out.println((num1 - 1) + (num2 - 1));
	}
}
