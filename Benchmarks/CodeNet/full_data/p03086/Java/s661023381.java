import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		String s = sc.nextLine();
		
		String out = "";
		for(int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'G'|| s.charAt(i) == 'C'|| s.charAt(i) == 'T') {
				out += s.charAt(i);
			}
		}
		System.out.println(out.length());

	}

}
