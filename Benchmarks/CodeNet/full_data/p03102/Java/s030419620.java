import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int C = scan.nextInt();
		List<Integer> bList = new ArrayList<>();

		int ans = 0;

		for (int i = 0; i < M; i++) {
			bList.add(scan.nextInt());
		}

		for (int i = 0; i < N; i++) {
			long temp = 0;

			for (int j = 0; j < M; j++) {
				temp += bList.get(j) * scan.nextInt();
			}
			if(temp + C > 0){
				ans++;
			}

		}
		System.out.println(ans);
		scan.close();
	}
}
