import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
//List<String> color = new ArrayList<>();
//int[] n = new int[k];

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		List<Integer> p1 = new ArrayList<>();
		List<Integer> p2 = new ArrayList<>();
		List<Integer> p3 = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int t = stdIn.nextInt();
			if (t <= a) 
				p1.add(t);
			else if (t > b)
				p3.add(t);
			else
				p2.add(t);
		}

		int m1 = p1.size();
		int m2 = p2.size();
		int m3 = p3.size();
		int ans = Math.min(m1, Math.min(m2, m3));
		System.out.println(ans);

	}
}