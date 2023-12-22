import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		int answer = 0;

		Scanner scanner = new Scanner(System.in);

		int s = scanner.nextInt();
		list.add(s);

		while(true) {
			if(s%2 == 0) {
				s = s/2;
			}
			else {
				s = 3*s + 1;
			}
			answer = search(s, list);
			if(answer != 0) {
				break;
			}
			list.add(Integer.valueOf(s));
		}
		System.out.println(answer);
	}

	public static int search(int n, List<Integer> list) {

		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == n) {
				return list.size() + 1;
			}
		}
		return 0;
	}

}