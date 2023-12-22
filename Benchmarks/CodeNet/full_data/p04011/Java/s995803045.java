import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		if(N <= K)
		{
			System.out.println( N * X);
		}else
		{
			int mo = K * X;
			int mi = (N - K) * Y;
			System.out.println(mo + mi);
		}
	}

}