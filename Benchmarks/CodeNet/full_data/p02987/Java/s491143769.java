import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		String line[] = sc.nextLine().split("");
		sc.close();
		boolean isFifty = true;

		String char1 = null,char2 = null;
		int charCnt1 = 0,charCnt2 = 0;

		for(String s : line) {
			if(char1 == null || char1.equals(s)) {
				char1 = s;
				charCnt1++;
			}else if(char2 == null || char2.equals(s)) {
				char2 = s;
				charCnt2++;
			}else {
				isFifty = false;
				break;
			}

			if(charCnt1 > 2 || charCnt2> 2) {
				isFifty = false;
				break;
			}
		}

		System.out.println(isFifty ? "Yes" : "No");
	}
}
