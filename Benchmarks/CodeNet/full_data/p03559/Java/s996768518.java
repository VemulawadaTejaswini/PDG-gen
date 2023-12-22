import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		List<Integer> c = new ArrayList<>();

		for(int i=0;i<N;i++) {
			a.add(sc.nextInt());
		}
		Collections.sort(a);

		for(int i=0;i<N;i++) {
			b.add(sc.nextInt());
		}
		Collections.sort(b);

		for(int i=0;i<N;i++) {
			c.add(sc.nextInt());
		}
		Collections.sort(c);

		int ans = 0;
		for(int i=0;i<N;i++) {
			int aless = 0;
			int cmore = 0;
			int bi = b.get(i);
			for(int j=0;j<=N;j++) {
				if(j == N || a.get(j) >= bi) {
					aless = j;
					break;
				}
			}

			for(int j=c.size()-1;j>=-1;j--) {
				if(j == -1 || bi >= c.get(j)) {
					cmore = c.size()-j-1;
					break;
				}
			}
			ans += aless * cmore;
		}
		System.out.println(ans);
	}
}