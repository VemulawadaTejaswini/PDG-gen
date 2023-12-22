import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q  = sc.nextInt();
		List<Integer> p = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			p.add(k-q);
		}
		for(int j = 0; j < q; j++) {
			int ans = sc.nextInt()-1;
			p.set(ans, p.get(ans)+1);
		}
		for(int i = 0; i < n; i++) {
			if(p.get(i)>0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}
}