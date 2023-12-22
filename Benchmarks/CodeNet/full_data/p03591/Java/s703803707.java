import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		if(S.length() < 4) {
			System.out.println("No");
			return;
		}
		if(S.substring(0, 3) == "YAKI") {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
