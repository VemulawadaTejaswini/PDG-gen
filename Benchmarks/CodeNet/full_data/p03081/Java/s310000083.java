import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] str = reader.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int Q = Integer.parseInt(str[1]);
		String[] abc = reader.readLine().split("");
		String[][] order = new String[Q][2];
		for (int i  =0; i < Q; i++) {
			String[] str2 = reader.readLine().split(" ");
			order[i][0] = str2[0];
			order[i][1] = str2[1];
		}
		int ans = 0;
		for (int i = 0; i < N; i++) {
			int i_keep = i;
			for (int k = 0; k < Q; k++) {
//				if (k == 0) {
//					i_keep = i;
//				}
//				System.out.println("abc["+i+"]=" + abc[i]);  ///////////////
//				System.out.println("order["+k+"][0]=" + order[k][0]);  ///////////////
				if (order[k][0].equals(abc[i_keep])) {
					if (order[k][1].equals("L")) {
						if (i_keep > 0) {
							i_keep--;
						}
						else {
							break;
						}
					}
					else {
						if (i_keep < N-1) {
							i_keep++;
						}
						else {
							break;
						}
					}
				}
				if (k == Q-1) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}