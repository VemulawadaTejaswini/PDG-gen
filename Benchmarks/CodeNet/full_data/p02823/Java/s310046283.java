import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = b-a;

		if(c%2==0) {
			System.out.print(c/2);
		} else if((a==1 || a==n) || (b==1 || b==n)) {
			System.out.print(c);
		} else {
			System.out.println(Math.min(a-1,n-b)+1);
		}

	}
}
