import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a  = sc.nextInt();
		int b  = sc.nextInt();
		int c  = sc.nextInt();
		boolean flag = false;
		for(int i = a; i <= a*b; i+=a) {
			if(i % b == c) {
				flag = true;
			}
		}
		if(flag) {
			System.out.println("YES");

		} else {
			System.out.println("NO");
		}
	}

}
