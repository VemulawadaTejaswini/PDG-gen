import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		int problem = 0;
		String result;
		int count_AC = 0;
		int count_WA = 0;

		ArrayList<Integer> list_count = new ArrayList<Integer>(n);
		ArrayList<HashSet<String>> list_judge = new ArrayList<HashSet<String>>(n);

		for(int i = 0;i < n;i++) {
			list_judge.add(new HashSet<String>());
			list_count.add(0);
		}

		for(int i = 0;i < k;i++) {
			problem = scan.nextInt();
			result = scan.next();
			list_judge.get(problem - 1).add(result);

			if(result.equals("WA")) {
				if(list_judge.get(problem - 1).contains("AC")) {

				}else {
					list_count.set(problem - 1 , list_count.get(problem - 1) + 1);
				}
			}
		}

		for(int i = 0;i < n;i++) {
			if(list_judge.get(i).contains("AC")) {
				count_AC += 1;
				count_WA += list_count.get(i);
			}
		}

		System.out.println(count_AC + " " + count_WA);
	}
}