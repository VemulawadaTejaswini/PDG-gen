import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			Integer input = sc.nextInt();
			if(list.contains(input)) {
				list.remove(input);
				count--;
			} else {
				list.add(input);
				count++;
			}
		}

		System.out.println(count);

	}
}