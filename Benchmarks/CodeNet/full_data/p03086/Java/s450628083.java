import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		int ans = 0;

		int a = 0;

		for(int i=0;i<S.length();i++) {

			char c = S.charAt(i);

			if(c=='A' || c=='C' || c=='G'|| c=='T') {

				a++;

				if(a>ans) ans = a;

			}else {

				a = 0;

			}

		}

		System.out.println(ans);

	}

}
