import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}
	
	public void solve(Scanner sc) {
		int k = Integer.parseInt(sc.next());
		
		int x = 1;
		int y = 1;
		for(int i=2; i<k; i++) {
			if(i%2==1) {
				x++;
			} else {
				y++;
			}
		}
		System.out.println(x*y);
	}
}
