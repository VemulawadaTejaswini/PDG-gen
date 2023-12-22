import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		String[] param = null;
		String str = null;

		if (line.indexOf(" ") != -1) {
			param = line.split(" ");
		} else {
			str = line;
		}

		String mozi = "#"; //並べる文字

		int str1 = Integer.parseInt(param[0]); // 縦軸
		int str2 = Integer.parseInt(param[1]); // 横軸

		String[] yoko = new String[str2 + 2];
		for (int i = 0; i < yoko.length; i++) {
			System.out.print(mozi);
		}
		System.out.println();

		for (int j = 0; j < str1; j++) {
			System.out.print(mozi);
			System.out.print(br.readLine());
			System.out.print(mozi);
			System.out.println();
		}

		for (int i = 0; i < yoko.length; i++) {
			System.out.print(mozi);
		}
	}
}