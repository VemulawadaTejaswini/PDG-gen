import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int four = 0;
		int two = 0;
		for(int i = 0;i <n;i++) {
			int number = sc.nextInt();
			if(number %4 ==0) {
				four++;;
			}else if(number %2 ==0) {
				two++;
			}
		}
		if(n % 2 ==0 ) {
			if(four >= n/2) {
				System.out.println("Yes");
				return;
			}else if(n-(four *2) <= two) {
				System.out.println("Yes");
				return;
			}else {
				System.out.println("No");
				return;
			}
		}else {
			if(four >= (n-1)/2) {
				System.out.println("Yes");
				return;
			}else if(n-(four *2) <= two) {
				System.out.println("Yes");
				return;
			}else {
				System.out.println("No");
				return;
			}
		}
	}
}