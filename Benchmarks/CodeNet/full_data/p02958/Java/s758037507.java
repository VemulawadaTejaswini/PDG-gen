
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for(int i = 1; i < n + 1; i++) {
			int tmp = sc.nextInt();
			if(tmp != i)
				cnt++;
		}
		if(cnt == 2 || cnt == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
