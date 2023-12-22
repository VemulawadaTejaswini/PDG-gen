
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		int k = sc.nextInt();
		sc.close();
		
		char c = s.charAt(k-1);
		

		for(int i=0;i<n;i++) {
			if(c != s.charAt(i)) {
				s = s.replace(s.charAt(i), '*');
			}
		}

		System.out.println(s);
	}

}
