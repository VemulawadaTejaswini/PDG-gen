import java.util.Scanner;
public class Main{
	public static void main(String args[])throws Exception{
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String S = sc.next();
		Boolean flag = true;
		char[] C = new char[S.length()];
		for(int i=0;i<S.length();i++) {
			C[i] = S.charAt(i);
			if(i == A && C[i] != '-') {
				flag = false;
			}
			if(i != A && C[i] == '-') {
				flag = false;
			}
		}
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}