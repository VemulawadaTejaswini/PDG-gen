import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();



		S = S.replace("dreameraser", "");
		S = S.replace("dreamerase", "");
		S = S.replace("dreamer", "");
		S = S.replace("dream", "");
		S = S.replace("eraser", "");
		S = S.replace("erase", "");


		if (S.equals("")){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		sc.close();
	}
}