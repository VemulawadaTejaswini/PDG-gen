import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e =0;
		while(true) {
			if(b >=a) {
				if(a % c ==0 || a % d == 0) {

				}else {
					e++;
				}
			}else {
				break;
			}
			a++;
		}
		System.out.println(e);
	}
}