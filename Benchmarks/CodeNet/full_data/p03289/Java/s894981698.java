import java.util.Scanner;

public class Main {
	static int num = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		boolean flg = true;
		

		if (!String.valueOf(S.charAt(0)).equals("A"))
			flg = false;
		
		if(!chkStr(S)) {
			flg=false;
		}

		for (int i = 2; i < S.length(); i++) {
			if(i==num) continue;
			
			if (Character.isUpperCase(S.charAt(i)))
				flg = false;
		}

		if (flg) {
			System.out.println("AC");
		} else {
			System.out.println("WA");
		}

		sc.close();

	}
	public static boolean chkStr(String str) {
		for(int i=2;i<str.length()-1;i++) {
			if (String.valueOf(str.charAt(i)).equals("C")) {
				num = i;
				return true;
			}
		}
		return false;
	}

}