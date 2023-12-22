
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long Acont = 0;
		long count = 0;
		S = S.replace("BC", "D");
		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i) == 'A') {
				Acont++;
			} else if(S.charAt(i) == 'D') {
				count += Acont;
			} else {
				Acont = 0;
			}
		}
		System.out.println(count);
	}

}
