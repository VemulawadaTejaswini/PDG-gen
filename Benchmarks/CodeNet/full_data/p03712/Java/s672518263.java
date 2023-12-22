import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int h = scan.nextInt();

		int w = scan.nextInt();

		scan.nextLine();

		List<String> arr = new ArrayList<>();

		for (int i = 0 ; i < h; i++) {
			arr.add(scan.nextLine());
		}

		for (int i = 0; i < w + 2; i++) {
			System.out.print("#");
		}

		System.out.println();

		for (String aaa : arr) {
			System.out.println("#"+aaa+"#");
		}

		for (int i = 0; i < w + 2; i++) {
			System.out.print("#");
		}

	}

}
