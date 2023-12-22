import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<String> param = new ArrayList<String>();
		int system = 2; // 文字の空白区切り 0:ON 1:OFF 2:(※数字の場合)

		while (sc.hasNext()) {

			if (system == 0)
				param.add(sc.next());
			if (system == 1)
				param.add(sc.nextLine());
			if (system == 2)
				num.add(sc.nextInt());
		}
		//param.remove(0); //不要な文字削除用
		//num.remove(0);
		Method(num, param);
	}

	static void Method(ArrayList<Integer> num, ArrayList<String> param) {
		System.out.println(num.get(0) + (num.get(1) / 2));
	}
}