import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		int[] M = new int[N];
		for(int i = 0;i < N;i++) {
			M[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		Arrays.sort(M);
		int sum = 0;
		int cnt = N;
		for(int i = 0;i < N;i++) {
			sum += M[i];
		}
		if(X - sum >= M[0]) {
			do{
				sum += M[0];
				cnt++;
			}while(X - sum >= M[0]);
		}
		System.out.println(cnt);
	}
}