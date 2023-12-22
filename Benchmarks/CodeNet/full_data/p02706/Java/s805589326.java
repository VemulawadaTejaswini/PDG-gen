import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int ans = N;

		for (int i = 0; i < M; i++){
			int A = scan.nextInt();
			ans -= A;
		}
		if (ans < -1){
			System.out.println(-1);
		}else {
			System.out.println(ans);
		}
	}
}