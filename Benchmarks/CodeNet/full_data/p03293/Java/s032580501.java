import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String T = sc.nextLine();
		boolean can = false;

		for(int i = 0;i < S.length();i++) {
			S = S + S.charAt(0);
			S = S.substring(1);
				if(S.equals(T)) {
					can = true;
					break;
				}
		}
		if(can == true) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
