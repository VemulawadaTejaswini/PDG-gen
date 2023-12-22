import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		StringBuilder sb = new StringBuilder(br.readLine());
		int q = Integer.parseInt(br.readLine());

		String A = new String();

		Boolean orderFlg = new Boolean(false);

		A = sb.toString();

		for(int i = 0; i < q; i++) {

			StringBuilder sb2 = new StringBuilder(br.readLine());
			if (sb2.length() == 1) {
				StringBuffer AA = new StringBuffer(A);
				AA = AA.reverse();
				A = AA.toString();
			}else if(sb2.toString().contains("1")) {
				A = sb2.toString().substring(sb2.toString().length() -1) + A ;
			}else {
				A = A + sb2.toString().substring(sb2.toString().length() -1);

			}

		}
		System.out.print(A);
	}
}