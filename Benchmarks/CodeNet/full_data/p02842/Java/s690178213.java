import java.util.Scanner;

public class Main {
	static int solve(int N){
		for(int X = 1 ; X <= N ; ++X){
			double Xd = X * 1.08;
			int Xi = (int)Xd;
			if(N == Xi){
				return X;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = solve(N);
		if(S < 0){
			System.out.println(":(");						
		}else{
			System.out.println(S);			
		}
	}
}
