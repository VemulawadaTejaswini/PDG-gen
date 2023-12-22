import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int s = scanner.nextInt();
		int ans = 0;

		for (int i = 0; i <= k; i++) {
			for (int j = 0; j <= k; j++) {
				for (int l = 0; l <= k; l++) {
					if(i+j+l==s){
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
 	}
}