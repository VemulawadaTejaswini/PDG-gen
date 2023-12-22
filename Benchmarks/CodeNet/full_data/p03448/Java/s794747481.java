
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int x = sc.nextInt();
		
		int ans = 0;
		
		for(int i = 0; i <= a; i++) {
			for(int k = 0; k <= b; k++) {
				for(int j = 0; j <= c; j++) {
					if((i * 500) + (k * 100) + (j * 50) == x) {
						ans++;
					}
				}
			}
		}
		
		System.out.println(ans);
	}

}
