import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		int count = Integer.parseInt(in);
		List<String> ansList = new ArrayList<String>();
		for (int i = 0; i < count; i++) {
			String line = sc.nextLine();
			if (ansList.contains(line)) {
				ansList.remove(line);
			} else {
				ansList.add(line);
			}

		}
		System.out.println(ansList.size());
	}

}