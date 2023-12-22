import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {


			int n = sc.nextInt();
			String s = sc.next();
			
			char[] chars = s.toCharArray();
			
			char[] converted = new char[chars.length];
			
			for(int i = 0 ; i < chars.length ; i++ ) {
				converted[i] = (char)(chars[i] + n);
				if (converted[i] > 'Z' ) {
					converted[i] = (char)(converted[i] - 26);
				}
			}
			
			System.out.println(String.copyValueOf(converted));
		}
	}
}