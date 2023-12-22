import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int hp = 0;
		List<Integer> takoyaki = new ArrayList<Integer>();
		takoyaki.add(sc.nextInt()); //1つ目のたこ焼き
		for (int i = 1; i < num; i++) {
			takoyaki.add(sc.nextInt());
			for (int j = 0; j < i; j++) {
				hp = hp + takoyaki.get(i) * takoyaki.get(j);
			}
		}
		System.out.println(hp);

	}
}