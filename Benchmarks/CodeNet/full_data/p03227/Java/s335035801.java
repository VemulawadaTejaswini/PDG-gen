import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		if(s.length()<=2) {
			System.out.println(s);
		}else {
			System.out.println(s.charAt(2)+""+s.charAt(1)+""+s.charAt(0));
		}

	}
	public static int floor(int n) {
		return (int)Math.floor((n*n + 4.0)/8.0);
	}

}
