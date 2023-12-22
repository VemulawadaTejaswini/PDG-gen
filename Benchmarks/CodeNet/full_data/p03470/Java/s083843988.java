
import java.util.*;

public class Main {

	public static void main(String[] args) {

		//フィールド
		int n = 0;
		int flag = 0;
		//リスト作成
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		ArrayList<Integer> intList = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			intList.add(x);
		}

		for(int i = 0; i < intList.size(); i++) {
			for(int j = intList.size() - 1; j > i; j--) {
				if(intList.get(j) > intList.get(j-1)) {
					int x = intList.get(j-1);
					intList.set(j-1, intList.get(j));
					intList.set(j, x);
				}
			}
		}

		for(int i = 0; i < intList.size() - 1; i++) {
			if(intList.get(i) > intList.get(i+1)) {
				flag++;
			}
		}


		System.out.println(flag + 1);
	}
}