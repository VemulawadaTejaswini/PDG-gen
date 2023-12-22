import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		int A = 1;
		int B = 1;
		for(int i = 0; i < N; i++){
			int x = scan.nextInt();
			int y = scan.nextInt();
			int n = Math.max((A+x-1)/x,(B+y-1)/y);
			A = n * x;
			B = n * y;
		}
		System.out.println(A+B);
	}
}
