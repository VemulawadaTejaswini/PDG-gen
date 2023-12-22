import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();

		List<String> cake = new ArrayList<>();
		for (int i = 0; i < h; i++) {
			cake.add(sc.next());
		}

		List<String> cut = new ArrayList<>();
		int count = 0;

		for (String row : cake) {

			String cutRow = "";

			if (row.contains("#")) {
				count++;

				boolean berry = false;

				for (int i = 0; i < row.length(); i++) {

					if (row.charAt(i) == '#') {
						if (berry) {
							count++;
						}
						berry = true;
					}
					cutRow += count + " ";
				}
			}

			cut.add(cutRow.trim());
		}

		String tmp = "";
		for (int i = 0; i < cut.size(); i++) {
			String row = cut.get(i);
			if(row.equals("") == false) {
				tmp = row;
			} else {
				cut.set(i, tmp);
			}
		}

		tmp = "";
		for (int i = cut.size() - 1; i >= 0; i--) {
			String row = cut.get(i);
			if(row.equals("") == false) {
				tmp = row;
			} else {
				cut.set(i, tmp);
			}
		}

		for (String row : cut) {
			System.out.println(row);
		}

		sc.close();
	}

}
