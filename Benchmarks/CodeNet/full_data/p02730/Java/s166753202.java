import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String s = scan.next();


		int n = s.length();

				if(s.substring(0,(n-1)/2).equals(s.substring((n+1)/2,n))) {

				System.out.println("Yes");

			}else {

			System.out.println("No");

			}

		scan.close();
	}

}