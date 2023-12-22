import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int a=0;
		int b =0;
		int c =0;
		if(S.charAt(0)=='o') {
			a = 100;
		}
		if(S.charAt(1)=='o') {
			b =100;
		}
		if(S.charAt(2)=='o') {
			c = 100;
		}
		System.out.println(700+a+b+c);
		sc.close();
	}

}
