
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int r=0,g=0,b=0;
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)=='R') {
				r++;
			}else if(S.charAt(i)=='G') {
				g++;
			}else {
				b++;
			}
		}
		long ans = r*g*b;
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;i++) {
				int k = j+j-i;
				if(k<N&&S.charAt(i)!=S.charAt(j)&&
						S.charAt(j)!=S.charAt(k)&&S.charAt(i)!=S.charAt(k)) {
					ans--;
				}
			}
		}
		System.out.println(ans);
	}

}