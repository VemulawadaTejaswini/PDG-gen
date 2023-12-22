import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String[] list = s.split("");

		final List<String> acgt = Arrays.asList("A", "C", "G", "T");

		List<Integer> countList = new ArrayList<Integer>();
		int result = 0;
		String prevstr = null;
		for (int i = 0; i < s.length(); i++) {
			String str = list[i];
			if (acgt.contains(str)) {
				result++;
			}
			if (prevstr != null && !acgt.contains(prevstr)) {
				countList.add(result);
				result = 0;
			}
			prevstr = str;
		}

		System.out.println(Collections.max(countList));

	}

}