import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		float N = stdIn.nextFloat();
		float K = stdIn.nextFloat();
		float ans = 0;
		float a = 1/N;
		for(float i = 1; i <= N; i++) {
			if(i >= K) {
				ans += a;
			}
			else {
				float b = a;
				for(float j = i; j <= K; j = j*2) {
					b = b/2;
				}
				ans += b;
			}
		}
		System.out.println(ans);

	}

}