import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		char[] S =sc.next().toCharArray();
		boolean flg = true;
		for (int i=0; i<A; i++) {
			if ( !(S[i]<='9' && S[i]>='0') ) {
				flg = false;
				break;
			}
		}
		for (int i=1; i<=B; i++) {
			if ( !(S[A+i]<='9' && S[A+i]>='0') ) {
				flg = false;
				break;
			}
		}
		if  (S[A]!='-') flg = false;
		if (S.length != (A+B+1)) flg = false;
		if (flg) System.out.println("Yes");
		else System.out.println("No");
	}
}
