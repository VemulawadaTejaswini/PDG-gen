import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int s = scan.nextInt();
		int count = 0;
		
		for(int i = 0; i <= k; i++) {
			for(int j = 0; j <= k; j++) {
				if((i + j) <= k && (i + j + k) >= s) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
