import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		if(S.indexOf("a") >= 0 && S.indexOf("b") >= 0 && S.indexOf("c") >= 0) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}
