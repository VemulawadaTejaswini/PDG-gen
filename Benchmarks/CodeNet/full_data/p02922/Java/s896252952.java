import java.util.Scanner;

public class Main{

	public static void main (String [] args) {

		Scanner sc = new Scanner (System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		boolean flag = true;
		int tap = 0;
		int count = 0;

		while (flag) {
			tap += A;
			count++;
			if (tap>=B) {
				flag = false;
			} else {
				tap -= 1;
			}
		}

		System.out.println(count++);
	}
}