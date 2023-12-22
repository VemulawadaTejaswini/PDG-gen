import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		char[] ans = new char[S.length()];
		int j = 0;
		for(int i=0; i<S.length(); i++) {
			if(i % 2 == 0) {
				ans[j] = S.charAt(i);
				j++;
			} else {
				;
			}
		}
		System.out.println(new String(ans));
	}

}
