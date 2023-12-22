import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str;
		
		str = scanner.next();
		
		char charValue = str.charAt(3);
		
		if(charValue == '7') {
			charValue = '8';
		}
		
		String oldStr = str;
		String newStr = oldStr.replace(str.charAt(3), '8');
		System.out.println(newStr);
	}

}
