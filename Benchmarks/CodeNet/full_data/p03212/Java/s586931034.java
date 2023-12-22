import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
	static int count = 0;
	static int max = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		max = sc.nextInt();
		calDigit(8, 0);
		System.out.println(count);
		sc.nextInt();
	}

	private static void calDigit(int digit, int num) {
		for(int i = 0; i < 10; i ++) {
			int crt = num * 10 + i;
			if(crt > max) {

			}else if(i == 0 || i == 3 || i == 5 || i == 7){
				if(digit > 0) {
					calDigit(digit - 1, crt);
				}else {
					String st = String.valueOf(crt);
					if(st.indexOf("0") == -1 && st.indexOf("3") != -1 && st.indexOf("5") != -1 && st.indexOf("7") != -1) {
						count ++;
					}
				}
			}
		}
	}
}