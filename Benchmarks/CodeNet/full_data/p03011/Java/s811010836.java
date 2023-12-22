import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int P = sc.nextInt();
		int Q = sc.nextInt();
		int R = sc.nextInt();

		List<Integer> list = new ArrayList<>();
		list.add(P + Q);
		list.add(R + Q);
		list.add(P + R);

		Collections.sort(list);
		System.out.println(list.get(0));

	}
}	