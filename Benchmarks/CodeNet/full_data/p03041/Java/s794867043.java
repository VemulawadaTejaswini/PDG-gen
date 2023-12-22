import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		String str = sc.next();
		
		StringBuffer sb = new StringBuffer(str);
		
		sb.replace(k-1, k, String.valueOf(sb.charAt(k-1)).toLowerCase());
		
		System.out.println(sb.toString());
	}
}
