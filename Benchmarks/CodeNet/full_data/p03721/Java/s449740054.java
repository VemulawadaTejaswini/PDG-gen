import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		ArrayList<Integer> bigArray = new ArrayList<>();

		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			for(int j = 0; j < b; j++) {
				bigArray.add(a);
			}
		}

		sc.close();

		int answer = bigArray.get(K-1);
		System.out.println(answer);
	}

}
