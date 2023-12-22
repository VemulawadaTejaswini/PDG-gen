import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputA1 = sc.next();
		String inputB1 = sc.next();
		String inputA2 = sc.next();
		String inputB2 = sc.next();
		String inputA3 = sc.next();
		String inputB3 = sc.next();

		int townA1 = Integer.parseInt(inputA1);
		int townB1 = Integer.parseInt(inputB1);
		int townA2 = Integer.parseInt(inputA2);
		int townB2 = Integer.parseInt(inputB2);
		int townA3 = Integer.parseInt(inputA3);
		int townB3 = Integer.parseInt(inputB3);

		List<Integer> towns = new ArrayList<>();
		towns.add(townA1);
		towns.add(townB1);
		towns.add(townA2);
		towns.add(townB2);
		towns.add(townA3);
		towns.add(townB3);

		List<Integer> result = new ArrayList<>();
		result.add(0);
		result.add(0);
		result.add(0);
		result.add(0);
		for(int i : towns) {
			result.set(i-1, result.get(i-1)+1);
		}

		int onceCount = 0;
		int twiceCount = 0;
		for(int c : result) {
			if(c == 1) {
				onceCount += 1;
			}else if(c == 2) {
				twiceCount += 1;
			}
		}

		if(onceCount == 2 && twiceCount == 2) {
			System.out.println("YES");
			sc.close();
		}else{
			System.out.println("NO");
			sc.close();
		}
	}
}