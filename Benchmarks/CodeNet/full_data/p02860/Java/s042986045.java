import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String s = scan.next();

		if(n %2 == 0) {
			// sを2で割って０~M     M+1~N比較
			if(s.substring(0, n/2).equals(s.substring(n/2, s.length()))){
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}else {
			System.out.println("No");
		}


	}
}