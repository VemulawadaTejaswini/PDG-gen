import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	        
		int N = sc.nextInt();
		String S = sc.next();
		String S1[] = S.split("");
		String S2[] = S.split("");
		
		if(N%2 == 0) {
			for(int i=0;i<N/2;i++) {
				if( !(S1[i].equals(S2[i+(N/2)])) ) {
					System.out.println("No");
					break;
				}
				if(i == N/2-1) {
					System.out.println("Yes");
				}
			}
			
		} else {
			System.out.println("No");
		}
	}
}