import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc =  new Scanner(System.in);
		String S = sc.next();
		int Q = sc.nextInt();
		for(int i = 0; i < Q; i++) {
			int q = sc.nextInt();
			if(q == 1) {
				StringBuffer str = new StringBuffer(S);
				S = str.reverse().toString();
			}
			else if(q == 2) {
				int F = sc.nextInt();
				if(F == 1) {
					String C = sc.next();
					S = C + S;
				}
				else if(F == 2){
					String C = sc.next();
					S = S + C;
				}
			}
		}
		System.out.println(S);
	}	
}