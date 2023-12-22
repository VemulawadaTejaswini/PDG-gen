import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String[] strs = sc.nextLine().split("");

		String[] target = { "k", "e", "y", "e", "n", "c", "e" };
		int count = 0;



		while (count < target.length) {
			if (!strs[count].equals(target[count])) {
				break;
			}
			count++;
		}

		if (count == target.length) {
			System.out.println("YES");
		} else {
			int strscount = count;
			while (strscount < strs.length) {
				if (strs[strscount].equals(target[count])) {
					break;
				}
				strscount++;
			}
			if (strscount == strs.length) {
				System.out.println("NO");
			} else {
				while (count < target.length && strscount < strs.length) {
					if (!strs[strscount].equals(target[count])) {
						break;
					}
					count++;
					strscount++;
				}
				if (count == target.length) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}

		}
	}

}