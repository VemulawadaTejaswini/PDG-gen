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
					for (int c=bStart; c<=N; c=c+K){
						if (((a+c) % K == 0) && ((b+c) % K == 0)){
							count ++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}