package abc42;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[2];
		int count = 0;
		while(count < 2) {
			int i = sc.nextInt();
			nums[count] = i;
			count++;
		}
		sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] strs = s.split(" ");
		List<Character> d = new ArrayList<>();
		for (String str : strs) {
			char[] c = str.toCharArray();
			for (char c1 : c) {
				d.add(c1);
			}

		}

		String str;
		char[] c;
		List<Character> chara;
		boolean isGood = false;
		if (d.size() == 10) {
			return;
		}
		while (true) {
			str = String.valueOf(nums[0]);
			c = str.toCharArray();
			chara = toList(c);
			for (int i = 0; i < str.length(); i++) {
				if (d.contains(chara.get(i))) {
					break;
				}
				if (i == str.length() - 1) {
					isGood = true;
				}
			}

			if (isGood) {
				System.out.println(nums[0]);
				return;
			}
			nums[0]++;
		}

	}

	public static ArrayList<Character> toList(char[] arr) {
		ArrayList<Character> list = new ArrayList<>();
		for (char c : arr) list.add(c);
		return list;
	}
}
