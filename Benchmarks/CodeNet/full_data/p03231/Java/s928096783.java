import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int M = sc.nextInt();

		String S = sc.next();

		String T = sc.next();

		char[] s = new char[S.length()];

		char[] t = new char[T.length()];

		int gcd = 0;

		boolean flag = false;

		int c = 0;




		for(int i=0;i<S.length();i++) {

			s[i] = S.charAt(i);

		}

		for(int i=0;i<T.length();i++) {

			t[i] = T.charAt(i);

		}

		if(s[0] != t[0] ) {

			System.out.println(-1);

		}else {

			gcd = gcd(S.length(),T.length());

			int a = S.length() / gcd;

			int b = T.length() / gcd;

			c = a * b * gcd;

			int d = 0;

			int i = 1;

			int e = 1;

			while(i<gcd) {

				e = (a * b) * i ;



				if(t[(e/a)] != s[(e/b)]) {



					flag = true;

					break;
				}

				i++;
			}


		}

		if(flag == false) {

			System.out.println(c);

		}else {

			System.out.println(-1);
		}



	}

	public static int gcd(int a, int b) {

		if(b==0) return a;

		return gcd(b,a%b);
	}

}
