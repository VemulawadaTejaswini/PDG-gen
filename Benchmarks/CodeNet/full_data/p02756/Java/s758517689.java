
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int Q = sc.nextInt();
		int[] T = new int[Q];
		int[] F = new int[Q];
		char[] C = new char[Q];
		for(int i = 0; i < Q; i++) {
			T[i] = sc.nextInt();
			if(T[i] == 2) {
				F[i]= sc.nextInt();
				C[i]= (sc.next()).charAt(0);				
			}
		}
		
		StringBuilder s = new StringBuilder();
		s.append(S);
		
		for(int i = 0; i < Q; i++) {
			if(T[i] == 2) {
				if(F[i] == 1) {
					s.insert(0, C[i]);
				}else {
					s.append(C[i]);
				}
			}else {
				s.reverse();
			}
		}
		System.out.println(s);
		
		

	}
}





