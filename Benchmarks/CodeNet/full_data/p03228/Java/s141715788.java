import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		long A = scn.nextLong();
		long B = scn.nextLong();
		long k = scn.nextLong();
		boolean a = true;
		for(int i = 0;i < k;i++) {
			if(a) {
				A /=2;
				B += A;
			}else {
				B /= 2;
				A +=B;
			}
			a = !a;
		}
		System.out.println(A + " " + B);
	}
}
