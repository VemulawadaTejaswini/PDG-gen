import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		ArrayList<Long> ary = new ArrayList<Long>();
		for(int i = 2; i <= Math.sqrt(N); i++) {
			while(N % i == 0) {
				ary.add((long)i);
				N /= i;
			}
		}
		ary.add(N);
		Collections.sort(ary);
		long num1 = 1;
		long num2 = 1;
		for(int i = 0; i < ary.size(); i++) {
			if(num1 > num2) {
				num2 *= ary.get(i);
			} else {
				num1 *= ary.get(i);
			}
		}
		System.out.println((num1 - 1) + (num2 - 1));
	}
}
