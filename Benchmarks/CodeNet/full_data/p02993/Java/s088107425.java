import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		char before = 0;
		for(int i = 0 ; i < s.length() ; i++) {
			char hoge = s.charAt(i);
			if(before == hoge) {
				System.out.println("Bad");
				System.exit(0);
			}
			before = hoge;
		}
		System.out.println("Good");

		sc.close();

	}

}
