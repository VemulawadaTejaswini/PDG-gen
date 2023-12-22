import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine();
		int time = sc.nextInt();
		char[] alphabet = text.toCharArray();
		for(int i = 0 ;i < text.length();i = i + time) {
			System.out.print(alphabet[i]);
		}	
	}
}