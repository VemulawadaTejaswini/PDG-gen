import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean flg = false;
		Scanner sc = new Scanner(System.in);
		char[] c = sc.nextLine().toCharArray();
		Arrays.sort(c);
		if(c[0] == c[1]) {
			if(c[2] == c[3]) {
				flg = true;
			}
		}
		
		if(flg == true) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		sc.close();
	}
}