import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.next().split("");
		List<String> acgt = new ArrayList<>();
		acgt.add("A");
		acgt.add("C");
		acgt.add("G");
		acgt.add("T");
		int res = 0;
		int resTmp = 0;
		for (String string : input) {
			if (acgt.contains(string)) {
				resTmp++;
			} else {
				if (resTmp > res) {
					res = resTmp;
				}
				resTmp = 0;
			}
		}
		if (resTmp > res) {
			res = resTmp;
		}

		System.out.println(res);
	}
}
