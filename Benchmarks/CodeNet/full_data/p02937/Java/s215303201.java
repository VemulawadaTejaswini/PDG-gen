import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String orgS = scan.nextLine();
		String t = scan.nextLine();
		String s = "";
		int max = 1000;
		int ans = -1;
		int[] indexArray = new int[t.length()];
		for (int i = 0; i < t.length(); i++) {
			indexArray[i] = -1;
		}
		char[] tChars = t.toCharArray();
		int lastIndex = -1;
		int chkIndex = 0;
		for (int i = 0; i <= max; i++) {
			s = s.concat(orgS);
			for (int j = chkIndex; j < tChars.length; j++) {
				if (indexArray[j] == -1) {
					ans = s.indexOf(tChars[j], lastIndex + 1);
					if (ans != -1) {
						chkIndex = j + 1;
						lastIndex = ans;
						indexArray[j] = ans;
						if (j == tChars.length - 1) {
							break;
						}
					}
					else {
						break;
					}
				}
			}
			if (s.length() > max) {
				break;
			}
		}
		if (indexArray[t.length() - 1] == -1) {
			System.out.println(-1);
		}
		else {
			System.out.println(indexArray[t.length() - 1] + 1);
		}
	}
}
