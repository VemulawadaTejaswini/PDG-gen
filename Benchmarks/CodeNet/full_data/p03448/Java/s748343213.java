import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int p = 0;
		for(int i = 0; i <= a; i++) {
			for(int j = 0; j <= b; j++) {
				for(int n = 0; n <= c; n++) {
					if(500 * i + 100 * j + 50 * n == x) {
						p++;
					}
				}
			}
		}
		System.out.println(p);
	}
}
