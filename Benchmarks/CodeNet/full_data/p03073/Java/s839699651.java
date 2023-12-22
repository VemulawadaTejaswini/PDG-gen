//A
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		int a = 0;

		int b = 0;

		for(int i=0;i<S.length();i++) {

			if(i%2==0 && S.charAt(i)=='1') a++;

			if(i%2==1 && S.charAt(i)=='0') a++;

		}

		for(int i=0;i<S.length();i++) {

			if(i%2==0 && S.charAt(i)=='0') b++;

			if(i%2==1 && S.charAt(i)=='1') b++;

			if(b>a) break;
		}

		int ans = Math.min(a, b);

		System.out.println(ans);
	}

}
