import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next(), t = scanner.next();
		char[] cs = s.toCharArray();
		Arrays.sort(cs);
		char[] ct = t.toCharArray();
		String S = new String(cs);
		String T = new String(ct);
		if(S.compareTo(T) < 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}
