import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N+1];
		for(int i = 1;i <= N;i++){
			P[i] = sc.nextInt();
		}
		sc.close();
		int cnt = 0;
		for(int i = N;i > 1;i--){
			if(P[i] > P[i-1]){
				cnt++;
			}
		}
		System.out.println(N - cnt);
	}
}