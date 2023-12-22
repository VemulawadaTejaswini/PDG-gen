import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long tempA = A;
		ArrayList<Long> ary1 = new ArrayList<Long>();
		for(int i = 2; i <= Math.sqrt(tempA); i++) {
			int flag = 0;
			while(A % (long)i == 0) {
				if(flag == 0) ary1.add((long)i);
				flag = 1;
				A /= i;
			}
		}
		if(A != 1) {
			ary1.add(A);
		}
		long tempB = B;
		ArrayList<Long> ary2 = new ArrayList<Long>();
		for(int i = 2; i <= Math.sqrt(tempB); i++) {
			int flag = 0;
			while(B % (long)i == 0) {
				if(flag == 0) ary2.add((long)i);
				flag = 1;
				B /= i;
			}
		}
		if(B != 1) {
			ary2.add(B);
		}
		long ans = 0;
		for(int i = 0; i < ary1.size(); i++) {
			if(ary2.contains(ary1.get(i))) ans++;
		}
		System.out.println(ans + 1);
	}
}
