
// TODO 自動生成されたメソッド・スタブ

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.w3c.dom.css.ElementCSSInlineStyle;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] cut = line.split("");

		int x = Integer.parseInt(cut[0]);
		int y = Integer.parseInt(cut[1]);
		int z = Integer.parseInt(cut[2]);

		if (x == z && y * 2 / 2 == y) {

			System.out.println("Yes");

		} else if (x == z && y * 2 / 2 == y) {

			System.out.println("No");
		}
	}
}
