import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String before = sc.next();
		String after = sc.next();
		boolean canReplace = true;
		int length = before.length();
		canReplace = check(length, before, after);
		if(canReplace) {
			canReplace = check(length, after, before);
		}
		System.out.println(canReplace ? "Yes" : "No");
	}

	public static boolean check(int length, String str1, String str2) {
		boolean canReplace = true;
		boolean hasChecked[] = new boolean[length];
		end: for(int i = 0; i < length; i ++) {
			char first = str1.charAt(i);
			char shouldBe = str2.charAt(i);
			if(!hasChecked[i]) {
				for(int j = i; j < length; j ++) {
					if(str1.charAt(j) == first) {
						hasChecked[j] = true;
						if(str2.charAt(j) != shouldBe) {
							canReplace = false;
							break end;
						}
					}
				}
			}
		}
		return canReplace;
	}
}