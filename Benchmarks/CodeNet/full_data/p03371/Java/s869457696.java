import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int AandB = (A*X)+(B*Y);
		int AB =  ((X+Y)/2)*2;
		int ABprice = AB*C;
		if(X%2!=0) {
			ABprice += A;
		}else if(Y%2!=0) {
			ABprice += B;
		}
		System.out.println(Math.min(AandB, ABprice));
	}
}