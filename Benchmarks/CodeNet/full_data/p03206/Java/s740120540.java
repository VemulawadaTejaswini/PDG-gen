import static java.lang.Integer.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int D;


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		D = parseInt(st.nextToken());

		int x = 25;
		System.out.print("Christmas");
		for(int i=x;i>D;i--) {
			System.out.print(" Eve");
		}
		System.out.println();

	}

}