import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		if(!kai(s)) {
			System.out.println("No");
			return;
		}

		if(kai(s.substring(0, (s.length() - 1) / 2))
			&& kai(s.substring((s.length() + 3) / 2 - 1, s.length()))) {
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
	}
	public static boolean kai(String s) {
		int i;
		int loopCnt = (s.length() - 1) / 2;
		int length = s.length();
		if(length % 2 == 0)
			loopCnt = length / 2;

		boolean res = true;
		for(i = 0; i < loopCnt; i++) {
			if(!s.substring(i, i + 1).equals(s.substring(length - i - 1, length - i))) {
				res = false;
				break;
			}
		}
		return res;
	}
}