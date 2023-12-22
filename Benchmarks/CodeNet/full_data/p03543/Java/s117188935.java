
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<Long> num = new ArrayList<Long>();
		ArrayList<String> param = new ArrayList<String>();
		int system = 0; // 文字の空白区切り 0:ON 1:OFF

		while (sc.hasNext()) {
			if (sc.hasNextLong()) {
				num.add(sc.nextLong());
			} else {
				if (system == 0)
					param.add(sc.next());
				if (system == 1)
					param.add(sc.nextLine());
			}
		}
		Method(num, param);
	}

	static void Method(ArrayList<Long> num, ArrayList<String> param) {
		int count = 0;

		if(num.get(0) == num.get(1)) count++;
		if(num.get(1) == num.get(2)) count++;
		if(num.get(2) == num.get(3)) count++;
		if(num.get(3) == num.get(4)) count++;

		if(count >= 2){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}