import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();

		/*
		String character[] = new String[S.length()];

		for(int i = 0; i < S.length(); i++) {
			character[i] = S.substring(0, S.length());
		}
		*/

		String charArray[] = new String[S.length()];
		charArray = S.split("");

		String str = "";
		boolean isSame = false;

		for(int i = 0; i < S.length(); i++) {
			if(str.equals(charArray[i])) {
				isSame = false;
				break;
			}else {
				isSame = true;
				str = charArray[i];
			}
		}

		if(isSame) {
			System.out.println("yes");
		}else{
			System.out.println("no");
		}

	}

}
