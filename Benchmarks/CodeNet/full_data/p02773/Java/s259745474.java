import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int max = 0;
		int count = 0;
		String s;
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list_ans = new ArrayList<String>();
		HashSet<String> list_record = new HashSet<String>();
		ArrayList<Integer> list_count = new ArrayList<Integer>();

		for(int i = 0;i < n;i++) {
			s = scan.next();

			if(!(list_record.contains(s))) {
				list.add(s);
				list_ans.add(s);
				list_count.add(0);
				list_record.add(s);
			}else {
				count = list.indexOf(s);
				list_count.set(count , list_count.get(count) + 1);

				if(list_count.get(count) > max) {
					max = list_count.get(count);
				}
			}
		}

		for(int i = 0;i < list_record.size();i++) {
			if(list_count.get(i) != max) {
				list_ans.remove(list.get(i));
			}
		}

		Collections.sort(list_ans);

		for(String ans : list_ans) {
			System.out.println(ans);
		}
	}
}