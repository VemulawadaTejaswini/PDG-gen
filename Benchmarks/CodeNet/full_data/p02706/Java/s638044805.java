import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < M; i++) {
			sum += sc.nextInt();
		}
		if(N - sum >= 0) {
			System.out.println(N - sum);
		} else {
			System.out.println(-1);
		}

	}
	
}