import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		// 入力
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> xList = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			xList.add(scanner.nextInt());
		}
		
		
		for (int i = 0; i < xList.size(); i++) {
			List<Integer> copyList = new ArrayList<>(xList);;
			copyList.remove(i);
			Collections.sort(copyList);
			int point = n/2 -1;
			int target = copyList.get(point);
			System.out.println(target);
		}

	}

}