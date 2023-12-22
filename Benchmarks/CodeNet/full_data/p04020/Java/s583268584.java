
import java.util.Scanner;

public class Main {

public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 0;
		int flag = 0;

		for (int i=0; i < n;i++){
			long l = sc.nextLong();


			if (l%2 == 0) {
				ans += l/2;
				flag = 0;
			} else {
				if (flag == 1) {
					ans += 1;
					flag = 0;
				}
				ans += l/2;
				flag = 1;
			}
		}

		System.out.println(ans);
		sc.close();
	}

}
