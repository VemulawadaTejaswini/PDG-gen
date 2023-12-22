import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int k = sc.nextInt();

		if(k>=a) {
			k-=a;
			a=0;
			if(k>=b) {
				b=0;
			}else {
				b-=k;
			}
		}else {
			a-=k;
		}

		System.out.println(a + " " + b);

	}
}

