
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String a = "A";
		String t = "T";
		String c = "C";
		String g = "G";
		List<String> list = Arrays.asList(a, t, c, g);

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		

		int maxS = 0;
		int maxE = 0;
		int maxlength = 0;
		int lentgh = input.length();
		// 探索
		for (int i = 0; i < lentgh; i++) {
			for (int j = i; j < lentgh+1; j++) {
				String temp = input.substring(i, j);
				List<String> strings = new ArrayList<>();
				for (char cha : temp.toCharArray()) {
					strings.add(Character.toString(cha));
				}
				System.out.println(temp);
				if (list.containsAll(strings) && strings.size() >= maxlength) {
					maxlength = strings.size();
				}
			}
		}
		System.out.println(maxlength);
	}
}