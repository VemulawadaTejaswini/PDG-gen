
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char []c = sc.next().toCharArray();
		
		int n = c.length;
		
		boolean jdg = true;
		for(int i = 0 ; i < (n-1)/2 ; i++) {
			if(c[i] != c[(n+2)/2 + i]) {
				jdg = false;
			}
		}
		if(jdg) {
			System.out.println("Yes");
		} 
		else {
			System.out.println("No");
		}

	}

}
