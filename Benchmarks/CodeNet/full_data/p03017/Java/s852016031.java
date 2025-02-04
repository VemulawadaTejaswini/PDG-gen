
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next())-1;
		int b = Integer.parseInt(sc.next())-1;
		int c = Integer.parseInt(sc.next())-1;
		int d = Integer.parseInt(sc.next())-1;
		
		char []p = sc.next().toCharArray();
		
		int len = 0;
		int maxl = 0;
		boolean path = false;
		
		for(int i = 0 ; i < n ;i++) {
			if(a > i || Math.max(c, d) < i) {
				continue;
			}
			
			if(p[i] == '#') {
				if(!path) {
					break;
				}
				maxl = Math.max(maxl, len);
				len = 0;
				path = false;
			}
			else {
				if(i > b) {
				len++;
				}
				path = true;
			}
		}
		
		if(!path) {
			System.out.println("No");
			return;
		}
		if(maxl >= 3) {
			System.out.println("Yes");
		}
		else if(c < d) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
