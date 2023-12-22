import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] Str = new char[S.length()];

		for(int i=0; i<S.length(); i++) {
			Str[i] = S.charAt(i);
		}Arrays.sort(Str);

		int count = 0;
		for(int j=1; j<S.length(); j++) {
			if(Str[j] == Str[j-1]) {
				count++;
			}
		}

		if(count == 0) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}

	}

}
