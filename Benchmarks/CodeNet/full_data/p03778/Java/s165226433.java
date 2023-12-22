import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		int strN = 1; // 文字列を何行受け取るか
		for (int i = 0; i < strN; i++) {
			line += br.readLine() + " ";
		}
		String[] param = line.split(" ");

		TableSlide(param);
	}

	static void TableSlide(String[] param) {
		int W = Integer.parseInt(param[0]);
		int a = Integer.parseInt(param[1]);
		int b = Integer.parseInt(param[2]);

		if (a < b) {
			int slide = b - (a + W);
			if (slide < 1) {
				System.out.println("0");
			} else {
				System.out.println(slide);
			}
		} else {
			int slide = a - (b + W);
			if (slide < 1) {
				System.out.println("0");
			} else {
				System.out.println(slide);
			}
		}

	}

}