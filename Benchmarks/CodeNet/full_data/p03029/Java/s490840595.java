

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {

		String[] in=br.readLine().split(" ");
		int num=Integer.parseInt(in[0]);
		int piece=Integer.parseInt(in[1]);


		int re=(3*num+piece)/2;



		System.out.println(re);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
