import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*Atcoder用
 * 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		int a = Integer.parseInt(tmp[0]);
		int b = Integer.parseInt(tmp[1]);
		int c = Integer.parseInt(tmp[2]);


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String get = br.readLine();
		char[] s = get.toCharArray();
		for(char c:s)System.out.println(c);

		List<Integer> ls = new ArrayList<Integer>();
		String[] tmp = br.readLine().split(" ");
		for (int n = 0; n < N; n++) {
			ls.add(Integer.parseInt(tmp[n]));
		}
 */

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		int N = Integer.parseInt(tmp[0]);
		int Q = Integer.parseInt(tmp[1]);
		String S = br.readLine();

		List<Integer> l = new ArrayList<Integer>();
		List<Integer> r = new ArrayList<Integer>();


		for (int n = 0; n < Q; n++) {
			tmp = br.readLine().split(" ");
			l.add(Integer.parseInt(tmp[0])-1);
			r.add(Integer.parseInt(tmp[1])-1);
		}

		List<Integer> als = new ArrayList<Integer>();

		int acCount = 0;
		boolean isA = false;
		for(int i = 0;i<N;i++){
			if(S.charAt(i) == 'A'){
				isA = true;
				als.add(acCount);
			}
			else if(S.charAt(i) == 'C' && isA){
				isA = false;
				acCount++;
				als.add(acCount);
			}else{
				isA = false;
				als.add(acCount);
			}
		}

		for(int i = 0;i<l.size();i++){
			int ans = 0;
			int nowL = l.get(i);
			int nowR = r.get(i);

			System.out.println(als.get(nowR) - als.get(nowL));
		}


	}
}