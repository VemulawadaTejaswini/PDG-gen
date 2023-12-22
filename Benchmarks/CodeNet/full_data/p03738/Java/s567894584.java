import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String num1 = in.next();
		String num2 = in.next();
		Compare com = new Main();
		int result = com.Compare(num1, num2);
		String display = "";
		if (result == -1) {
			display = "LESS";
		}else if (result == 1) {
			display = "GREATER";
		} else {
			display = "EQUAL";
		}
		System.out.println(display);
	}
	
	private int Compare(String num1, String num2) {
		// TODO Auto-generated method stub
		int len1 = num1.length();
		int len2 = num2.length();
		if (len1 < len2) {
			return -1;
		}else if (len1 > len2) {
			return 1;
		}else {
			int i = 0;
			while (i < len1) {
				if (num1.charAt(i) > num2.charAt(i)) {
					return 1;
				}else if(num1.charAt(i) < num2.charAt(i)){
					return -1;
				}
				i++;
			}
		}
		return 0;
	}
}