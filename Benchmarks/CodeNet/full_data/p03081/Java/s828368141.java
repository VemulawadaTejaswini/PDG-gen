import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		int b = scn.nextInt();
		String c = scn.next();
		String[] strArray = c.split("");

		List<String> moji = new ArrayList<>();
		List<Integer> golem = new ArrayList<>();

		for (int i = 0; i < strArray.length; i++) {
			moji.add(strArray[i]);
		}
		for(int i = 0; i < moji.size(); i++) {
			golem.add(1);
		}

		for(int i = 0; i < b; i++) {
			String d = scn.next();
			String e = scn.next();

			for(int j = 0; j < moji.size(); j++) {
				if(moji.get(j).equals(d)) {
					if(e.equals("L")) {
						if(golem.get(j) == 1 && j != 0) {
							golem.set(j - 1, golem.get(j) + golem.get(j - 1));
						}
					} else {
						if(golem.get(j) == 1 && j != moji.size() - 1) {
							golem.set(j + 1, golem.get(j) + golem.get(j + 1));
						}
					}
					golem.set(j, 0);
				}
			}
		}

		System.out.println(golem.stream().mapToInt(n -> n).sum());
	}
}