import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;

		for(int a = 1; a <= n; a++) {
			for(int b = 1; b <= n; b++) {
				for(int c = 1; c <= n; c++) {
					if(((a + b) % k == 0) && ((b + c) % k == 0) && ((c + a) % k == 0)){
						count++;
					}
				}
			}
		}

		System.out.println(count);

	}

}
