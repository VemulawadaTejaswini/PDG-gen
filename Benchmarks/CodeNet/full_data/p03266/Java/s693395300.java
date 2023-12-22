import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int count=0;
		for (int a=1; a<=N; a++){
			int bStart = K - (a % K);
			if (bStart == 0){
				bStart = K;
			}
			for (int b=bStart; b<=N; b=b+K){
				if ((a%K) == (b%K)){
					int plus = N / K;
					if (K % N > bStart){
						plus++;
					}
					count += plus;
				}
			}
		}
		System.out.println(count);
	}
}