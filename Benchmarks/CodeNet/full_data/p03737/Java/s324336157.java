import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();
		
		String result = "" + (char)(str1.charAt(0) - 'a' + 'A')
							+ (char)(str2.charAt(0) - 'a' + 'A')
							+ (char)(str3.charAt(0) - 'a' + 'A');
		System.out.println(result);
		
		sc.close();
	}

}
