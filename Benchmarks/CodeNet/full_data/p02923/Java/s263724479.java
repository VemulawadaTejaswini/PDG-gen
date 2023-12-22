import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> h = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			h.add(sc.nextInt());
		}
		Collections.reverse(h);
		int ans = 0;
		int count = 0;
		for(int i = 1;i < n; i++) {
			if(h.get(i-1)<=h.get(i)) {
				count++;
			}
			else {
				count = 0;
			}
			ans = Math.max(ans, count);
		}
		System.out.println(ans);
	}
}
