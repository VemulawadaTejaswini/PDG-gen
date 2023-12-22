import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int ans = 0;

		if (a==b && b==c) {
			System.out.println(0);
			System.exit(0);
		}
		if (a>b) {int i = a; a = b; b = i;}
		if (b>c) {
			if (a>c) {int i=a; a=c; c=b; b=i;}
			else {int i=b; b=c; c=i;}
		}
		//a<=b<=c

		if (b<c) {
			ans += (c-b);
		}

		if ((b-a)%2==1) {
			ans++;
			b++;
			c++;
		}

		ans += (b-a)/2;

		System.out.println(ans);
	}

}