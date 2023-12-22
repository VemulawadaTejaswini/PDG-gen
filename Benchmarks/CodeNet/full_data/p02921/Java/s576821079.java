
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		String[] Slist = S.split("");
		String[] Tlist = T.split("");
		int countNum = 0;

		for(int i = 0; i <= 2 ; i++) {
			if(Slist[i].equals(Tlist[i])) {
				countNum++;
			}
		}

		System.out.println(countNum);
	}
}