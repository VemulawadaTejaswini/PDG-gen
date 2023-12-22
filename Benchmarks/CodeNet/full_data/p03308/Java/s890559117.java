import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		try (Scanner sc = new Scanner(System.in);) {
			int n = Integer.parseInt(sc.nextLine());
			String a = sc.nextLine();
			String[] b = a.split(" ");
			List<Integer> list = new ArrayList<>();

			for (int i = 0; i < b.length; i++) {
				list.add(Integer.parseInt(b[i]));
			}

			Collections.sort(list);

			System.out.println(list.get(list.size() - 1) - list.get(0));
		}
	}
}
