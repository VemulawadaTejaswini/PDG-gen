import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	String s = sca.next();
	for(int i = 0; i < s.length(); i++) {
		System.out.print("x");
	}
	System.out.println("");

	// 後始末
	sca.close();
	}
}