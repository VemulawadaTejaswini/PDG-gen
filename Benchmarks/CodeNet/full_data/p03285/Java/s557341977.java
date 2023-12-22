import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int jud = 0;
		
		for(int i = 0; i <= 25; i++) {
			for(int j = 0; j <= 14; j++) {
				if((4 * i) + (7 * j) == N) {
					jud = 1;
				}
			}
		}
		if(jud == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
