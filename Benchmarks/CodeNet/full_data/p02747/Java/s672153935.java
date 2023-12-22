import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		int i=0;
		while(i<str.length()) {
			if(str.contains("hi") && !str.contains("hii") ) {
				System.out.println("Yes");
				break;
			} else if(str.contains("hii")) {
				i = str.indexOf("hii")+3;
				str = str.substring(i);
				if(str.contains("hi") && !str.contains("hii")) {
					System.out.println("Yes");
					break;
				}
			} else {
				System.out.println("No");
				break;
			}
		}
		if(i>=str.length())System.out.println("No");
	}

}