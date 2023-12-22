import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> d = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			d.add(sc.nextInt());
		}
		sc.close();
		Collections.sort(d);
		int ans = d.get(n/2) - d.get(n/2-1);
		System.out.println(ans);
	}

}
