import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		System.out.println((str.lastIndexOf("Z")) - (str.indexOf("A"))+1);
	}

}
