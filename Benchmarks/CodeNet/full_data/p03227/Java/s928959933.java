import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		if(a.length() == 2) {
			System.out.println(a);
		} else {
			String A = a.substring(2, 3);
			String B = a.substring(1, 2);
			String C = a.substring(0 ,1);
			
			String str = A + B + C;
			
			System.out.println(str);
		}
		
	}
}
