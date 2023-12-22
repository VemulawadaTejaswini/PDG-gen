import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("整数Kの値(2 <= K <= 2500)");
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		System.out.println("整数Sの値(0 <= S <= 3K)");
		int s = scan.nextInt();

		int xay[] = new int[k+1];
		int yay[] = new int[k+1];
		int zay[] = new int[k+1];
		for(int i = 0; i <= k; i++) {
			xay[i] += i;
		}
		for(int i = 0; i <= k; i++) {
			yay[i] += i;
		}
		for(int i = 0; i <= k; i++) {
			zay[i] += i;
		}
		int count = 0;
		for(int i = 0; i <= k; i++) {
			for(int j = 0; j <= k; j++) {
				for(int h = 0; h <= k; h++) {
					if((xay[i] + yay[j] + zay[h]) == s) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
