import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		char[] A=S.toCharArray();
		int count=0;
		
		for(int i=0;i<N;i++) {
			if(A[i]=='A') {
				if(A[i+1]=='B') {
					if(A[i+2]=='C') {
						count++;
					}
				}
			}
		}
		System.out.println(count);
		
		
	}
}
