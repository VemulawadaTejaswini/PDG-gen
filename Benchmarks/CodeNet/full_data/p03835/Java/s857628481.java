import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int S = sc.nextInt();
		long answer = 0;
		for(int i = 0;i <= K;i++){
			for(int j = 0;j <= K;j++){
				if(0 <= S - i - j && S - i - j <= K)answer++;
			}
		}
		System.out.println(answer);
	}
}