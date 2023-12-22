import java.util.*;
public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), x = sc.nextInt();
		int cnt = 0;
		for(int i = 0; i <= a; i++) {
			for(int j = 0; j <= b; j++) {
				for(int k = 0; k <= c; k++) {
					if(500 * i + 100 * j + 50 * k == x) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);

	}

}
