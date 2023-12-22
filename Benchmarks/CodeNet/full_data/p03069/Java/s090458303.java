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
		String num = br.readLine();
		int N = Integer.parseInt(num);
		String get = br.readLine();
		char[] S = get.toCharArray();

		List<Integer> whiteNum = new ArrayList<Integer>();
		List<Integer> blackNum = new ArrayList<Integer>();

		int count = 0;
		for(int i = 0;i<S.length;i++){
			if(S[i] == '.')count++;
			whiteNum.add(count);

		}
		count = 0;
		for(int i = 0;i<S.length;i++){
			if(S[i] == '#')count++;
			blackNum.add(count);
		}

		int min = (int) Math.pow(10,10);
		for(int j = 0;j<S.length;j++){
			count = blackNum.get(j) + (whiteNum.get(S.length-1) - whiteNum.get(j));
			min = Math.min(min, count);
		}

		System.out.println(min);

	}

}
