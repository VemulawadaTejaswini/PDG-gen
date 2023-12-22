import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		/*for(int i = 1; i <= Math.min(Math.sqrt(A), Math.sqrt(B)); i++) {
			if(A % i == 0 && B % i == 0) {
				ary.add((long)i);
				if(A % (A / i) == 0 && B % (A / i) == 0) {
					if(!ary.contains(A / i)) {
						ary.add(A / i);
					}
				}
				if(A % (B / i) == 0 && B % (B / i) == 0) {
					if(!ary.contains(B / i)) {
						ary.add(B / i);
					}
				}
			}
		}*/
		long tempA = A;
		ArrayList<Long> ary1 = new ArrayList<Long>();
		for(int i = 2; i <= Math.sqrt(tempA); i++) {
			int flag = 0;
			while(A % i == 0) {
				if(flag == 0) ary1.add((long)i);
				flag = 1;
				A /= i;
			}
		}
		long tempB = B;
		ArrayList<Long> ary2 = new ArrayList<Long>();
		for(int i = 2; i <= Math.sqrt(tempB); i++) {
			int flag = 0;
			while(B % i == 0) {
				if(flag == 0) ary2.add((long)i);
				flag = 1;
				B /= i;
			}
		}
		
		long ans = 0;
		for(int i = 0; i < ary1.size(); i++) {
			if(ary2.contains(ary1.get(i))) ans++;
		}
		System.out.println(ans + 1);
	}
}
