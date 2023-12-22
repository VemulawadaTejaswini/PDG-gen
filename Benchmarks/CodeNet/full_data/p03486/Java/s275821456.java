import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String str1 = s.next();
		String str2 = s.next();

		int min1 = 1000;
		int max2 = 0;

		for (int i = 0; i < str1.length(); i++) {
			int strInt1 = (int) str1.charAt(i);
			min1 = Math.min(min1, strInt1);
		}

		for (int i = 0; i < str2.length(); i++) {
			int strInt2 = (int) str2.charAt(i);
			max2 = Math.max(max2, strInt2);
		}

		if ((min1 == max2)&&(str1.replace((char)min1 + "", "").length()==str2.replace((char)max2 + "", "").length())) {
			int count1 = replace(str1, (char) min1);
			int count2 = replace(str2, (char) max2);

			String ans = (count1 < count2) ? "Yes" : "No";
			System.out.println(ans);
			return;
		}else if(min1 == max2){
			System.out.println("No");
			return;
		}

		String ans = (min1 < max2) ? "Yes" : "No";
		System.out.println(ans);
	}

	static int replace(String str, char target) {
		return str.length() - str.replace(target + "", "").length();
	}
}
