import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int flag = 0;
		for(int i=0; i<s.length(); i++) {
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {
					flag++;
				}
			}
		}
		if(flag>=2) {
			System.out.println("Bad");
		}else {
			System.out.println("Good");
		}
		
	}
}
