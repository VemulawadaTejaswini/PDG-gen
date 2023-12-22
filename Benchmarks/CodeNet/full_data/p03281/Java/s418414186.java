import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		for(int i = 1; i <= N; i += 2) {
			if(N % i == 0) {
				cnt ++;
			}
		}
		int ans = 0;
		if(cnt == 8) {
			ans = 1;
		}

		System.out.println(ans);
		sc.close();
	}

}
