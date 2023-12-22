import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();
		
		String result = str1.substring(0,1) + str2.substring(0,1) + str3.substring(0,1);
		
		System.out.println(result);
	}
}
