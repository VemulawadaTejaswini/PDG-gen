import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int[] day_visit;
	static ArrayList<Integer> day_success;
	static ArrayList<Integer> day_fail;
	static int count = 0;
	static String[] day;
	static int C;
	static ArrayList<Integer> s;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(bfr.readLine());
		N = Integer.parseInt(str.nextToken());
		int K = Integer.parseInt(str.nextToken());
		C = Integer.parseInt(str.nextToken());
		day_visit = new int[N];
		day_success = new ArrayList<Integer>();
		s = new ArrayList<Integer>();
		str = new StringTokenizer(bfr.readLine());
		day = str.nextToken().split("");
		dfs(K, 0);
		for(int i : day_success) {
			System.out.println(i+1);
		}
	}

	static void dfs(int left, int index) {
		if (left == 0) {
			if (count==0) {
//			System.out.println("left == 0");
				for (int i : s) {
					day_success.add(i);
				}
			}
			else {
				day_fail = new ArrayList<Integer>();
				Iterator it = day_success.iterator();
				while(it.hasNext()) {
					int i = (Integer)it.next();
					if(!s.contains(i)) {
						day_fail.add(i);
					}
				}
				for(int i : day_fail) {
					day_success.remove((Integer)i);
				}
			}
			count++;
//			Arrays.fill(day_visit, 0);
			return;
		} else {

			for (int i = index; i < N; i++) {
				if (day[i].equals("o")) {
//					System.out.println((i+1)+" "+left);
					s.add(i);
					int size = s.size();
					dfs(left - 1, i + C + 1);
					s.remove(size - 1);
				}
			}
		}
	}
}
