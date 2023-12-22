import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] p = new int[n];
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		int[][] xy = new int[m][2];
		for(int i = 0; i < m; i++) {
			xy[i][0] = sc.nextInt();
			xy[i][1] = sc.nextInt();
		}
		ArrayList< ArrayList<Integer> > checks = new ArrayList< ArrayList<Integer> >();
		ArrayList<Integer> check = new ArrayList<Integer>();

		HashSet<Integer> allhash = new HashSet<Integer>();
		for(int k = 1; k <= n; k++) {
			if(allhash.contains(k))
				continue;
			check = new ArrayList<Integer>();
			check.add(k);
			allhash.add(k);
			HashSet<Integer> hash = new HashSet<Integer>();
			hash.add(k);
			for(int i = 0; i < check.size(); i++) {
				int num = check.get(i);
				for(int j = 0; j < m; j++) {
					if(xy[j][0] == num && hash.contains(xy[j][1]) == false) {
						allhash.add(xy[j][1]);
						hash.add(xy[j][1]);
						check.add(xy[j][1]);
					}
					if(xy[j][1] == num && hash.contains(xy[j][0]) == false) {
						allhash.add(xy[j][0]);
						hash.add(xy[j][0]);
						check.add(xy[j][0]);
					}
				}
			}
			checks.add(check);
		}

		int cnt = 0;
		for(ArrayList<Integer> array : checks) {
			for(int i = 0; i < array.size(); i++) {
				if(array.contains(p[array.get(i)-1])) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);
	}
}
