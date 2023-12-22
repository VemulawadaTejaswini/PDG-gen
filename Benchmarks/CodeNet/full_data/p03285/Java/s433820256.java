import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = false;
		for(int i = 0; i * 4 <= n; i++) {
			for(int j = 0; j * 7 + i * 4 <= n; j++) {
				if(j * 7 + i * 4 == n) {
					flag = true;
				}
			}
		}
		if(flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}