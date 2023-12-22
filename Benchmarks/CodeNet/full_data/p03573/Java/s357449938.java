package contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		String[] cut = x.split(" ");
		
		if (cut[1].equals(cut[2])) {
			System.out.println(cut[0]);
		}

		if (cut[0].equals(cut[1])) {
			System.out.println(cut[2]);
		}
		if (cut[0].equals(cut[2])) {
			System.out.println(cut[1]);
			
		}
	}

}