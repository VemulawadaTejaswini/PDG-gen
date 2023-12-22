
import java.util.*;
import java.util.Map.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	public void run() {
		Scanner sc = new Scanner(System.in);
		char c[] = sc.next().toCharArray();
		int n = c.length;

		int l;
		int r;
		if(n%2==0) {
			l=n/2-1;
			r=n/2;
		}else {
			l=n/2;
			r=n/2;
		}
		char base = c[l];
		while(r<n) {
			if(c[l] != c[r] || c[l] != base) {
				break;
			}
			base = c[l];
			l--;
			r++;
		}
		System.out.println(r);
		sc.close();
	}
}
