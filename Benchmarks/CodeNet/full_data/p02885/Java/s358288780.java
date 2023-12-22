package curtain;
import java.util.Scanner;
class Curtain {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int A = stdIn.nextInt();
		int B = stdIn.nextInt();

		int c = B *= 2; //両カーテンの長さの合計

		if(A-c>0)
		System.out.println(A-c);

		else {
			System.out.println(0);
		}
	}

}
