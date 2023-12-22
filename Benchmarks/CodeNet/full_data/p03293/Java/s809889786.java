import java.util.Scanner;
public class Main { //B

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();

		String TT = T + T;

		if(TT.contains(S)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
