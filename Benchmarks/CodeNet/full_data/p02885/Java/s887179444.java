import java.util.Scanner;
class Curtain {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int A;
		do{
			System.out.print(A = stdIn.nextInt());

		}while(!(A>=1 && A<=100));

		int B;
		do {
			System.out.print(B = stdIn.nextInt());

		}while(!(B>=1 && B<=100));

		int c = B *= 2; //両カーテンの長さの合計

		if(A-c>0)
		System.out.println(A-c);

		else {
			System.out.println(0);
		}
	}

}
