import static java.lang.Integer.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int A = parseInt(st.nextToken());
		int B = parseInt(st.nextToken());

		if(B % A == 0) {
			System.out.println(A+B);
		}else {
			System.out.println(B-A);
		}
	}
}
