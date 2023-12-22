import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
		String S = br.readLine();
		String T = br.readLine();

		int[] ASCII = new int[26];

		for(int i = 0;i<26;i++){
			ASCII[i] = -1;
		}


		for(int i = 0;i<S.length();i++){
			int s = S.charAt(i);
			int r = T.charAt(i);

			if(ASCII[r-97] == -1){
				ASCII[r-97] = s;
			}else if(ASCII[r-97] != s){
				System.out.println("No");
				System.exit(0);
			}

		}
		System.out.println("Yes");
	}

}