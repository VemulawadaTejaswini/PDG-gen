import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int N;
	int A;
	int B;
	public void run() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		int ans = 0;
		for(int i=1; i<=N; i++) {
			int sum=0;
			int v = i;
			while(v != 0) {
				sum += v % 10;
				v = v/10;
			}
			if(A <= sum && sum <= B) {
				ans += i;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}