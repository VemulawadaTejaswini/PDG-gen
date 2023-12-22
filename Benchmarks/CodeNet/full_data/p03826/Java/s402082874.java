import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int A;
		int B;
		int C;
		int D;
		do {
			A=input.nextInt();
			B=input.nextInt();
			C=input.nextInt();
			D=input.nextInt();
		}while(A<1||A>10000||B<1||B>10000||C<1||C>10000||D<1||D>10000);
		System.out.println(Math.max(A*B, C*D));
	}
}