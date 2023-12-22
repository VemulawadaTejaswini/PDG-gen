import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		
		String ans = "";
		if(a == b && b == c ) {
			ans = "No";
		}else if(a != b && a!= c && b != c ) {
			ans = "No";
		}else {
			ans = "Yes";
		}
		
		System.out.println(ans);

	}



}