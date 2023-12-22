import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int X = scan.nextInt();
		int Y = scan.nextInt();
		int M;
		if(N >= K){
			M = K * X + (N - K) * Y;
			System.out.println(M);
		}
		else{
			M = N * X;
			System.out.println(M);
		}
		
 
	}
 
}