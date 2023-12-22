import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int N = keyboard.nextInt();
		long[] H = new long[N];
		
		for(int i=0; i<N; i++) {
			H[i] = keyboard.nextLong()+1;
		}
		String ans = "Yes";
		
		for(int n=0; n<N; n++) {
			if(n==0) {
				H[n]--;
			}else if(n==N-1) {
				if(H[n]-H[n-1]<0) {
					ans = "No";
				}
			}else {
				if(H[n+1]-H[n]<=-2) {
					ans = "No";
					break;
				}else if(H[n]-H[n-1]>=1) {
					H[n]--;
				}
			}
		}
		
		System.out.println(ans);
		keyboard.close();
	}
}
