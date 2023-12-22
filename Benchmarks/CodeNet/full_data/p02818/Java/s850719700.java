import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int k = sc.nextInt();

		int num =0;

		num = a-k;

		if(num<0) {
			k=k-a;
			a =0;
			num = Math.abs(num);
			num = b-k;
			if(num<0) {
				b = 0;
			}else {
				b-=k;
			}

		}else if(num>0) {
			a -= k;
		}

		System.out.println(a + " " + b);

	}
}

