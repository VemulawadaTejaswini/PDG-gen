import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc =  new Scanner(System.in);
		String S = sc.next();
		int Q = sc.nextInt();
		int q;
		for(int i = 0; i < Q; i++) {
			q = sc.nextInt();
			if(q == 1) {
				StringBuffer str = new StringBuffer(S);
				S = str.reverse().toString();
			}
			else if(q == 2) {
				int j = sc.nextInt();
				if(j == 1) {				
					String A = sc.next();
					S = A+S;
				}
				else if(j == 2) {
					String A = sc.next();
					S = S + A;
				}
			}
		}
		System.out.println(S);
	}
}