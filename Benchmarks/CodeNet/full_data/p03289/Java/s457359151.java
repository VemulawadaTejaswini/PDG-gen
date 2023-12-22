
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		int cnt = 0;
		int capitalC = 0;
		
		if (S.startsWith("A")) {
			cnt += 1;
		}
		for (int i = 2; i < S.length() - 3; i++) {
			if (S.substring(i).equals("C") && capitalC == 0) {
				cnt += 1;
				capitalC = i;
			}else {
				break;
			}
		}
		String lowS = toLower(S);
		for (int i = 0; i < S.length() - 1; i++) {
			if (lowS.substring(i).equals(S.substring(i))){
				
			}else {
				cnt += 1;
			}
		}
		
		if (cnt == 4) {
			System.out.println("AC");
		}else {
			System.out.println("WA");
		}
	}
	
	public static String toLower(String S) {
		String str;
		str = S.toLowerCase();
		return str;
	}
}