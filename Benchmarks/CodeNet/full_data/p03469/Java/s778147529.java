import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		StringBuilder s1= new StringBuilder(s);
		s1.replace(3, 4, "8");
		System.out.println(s1);
	}

}
