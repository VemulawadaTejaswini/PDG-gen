import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long num = gcd (A,B);
		boolean flag = true;
		ArrayList <Integer> list = new ArrayList <Integer>();

		long kazu = num;

		for (int index=2; index<num; index++) {
			while (flag) {
				if (kazu%index!=0) {
					flag = false;
				} else {
					kazu/=index;
					if (!list.contains(index)) {
						list.add(index);
					}
				}
			}
			flag = true;
		}

		System.out.println(list.size()+1);

	}


	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
}