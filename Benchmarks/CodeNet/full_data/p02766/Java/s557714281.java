import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		int n = Integer.parseInt(tmp[0]);
		int k = Integer.parseInt(tmp[1]);
		List<Character> list = new LinkedList<Character>();

		while(n > 0) {

			list.add((char) (n % k));
			n /= k;

		}



		System.out.println(list.size());

	}
}