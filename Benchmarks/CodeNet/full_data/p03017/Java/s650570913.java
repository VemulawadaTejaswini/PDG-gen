
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
		
		
		for(int i = a ; i < Math.max(c,d) ;i++) {
			if(p[i]== '#' && p[i+1] == '#') {
				System.out.println("No");
				return;
			}
		}
		
		if(c < d) {
			System.out.println("Yes");
		}
		else {
			int len = 0;
			int max = 0;
			for(int i = b-1 ; i <= d+1 ;i++) {
				if(p[i] == '.') {
					len++;
				}
				else {
					max = Math.max(max, len);
					len = 0;
				}
			}
			String ans = max >= 3 ? "Yes":"No";
			System.out.println(ans);
		}

	}

}
