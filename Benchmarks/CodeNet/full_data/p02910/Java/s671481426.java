import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int len = s.length();

		int i;
		for(i = 0; i < len; i++) {
			if(i % 2 != 0) {
				if(s.substring(i, i + 1).equals("R")) {
					System.out.println("No");
					return;
				}
			}else {
				if(s.substring(i, i + 1).equals("L")) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}
