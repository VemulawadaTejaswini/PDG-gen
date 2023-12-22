import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a == 1) {
			if (b >= 2) {
				b = b - 2;
				System.out.println(b);
			} else {
				System.out.println(1);
			}
		}


		if(a==2){
			System.out.println(0);
		}


		if(a>=3){
			if(b==1){
				System.out.println(a-2);
			}
			if(b==2){
				System.out.println(0);
			}

			if(b>=3){
				int x;
				x=a*b;
				x=x-2*a-2*b+4;
				System.out.println(x);
			}
		}


	}
}