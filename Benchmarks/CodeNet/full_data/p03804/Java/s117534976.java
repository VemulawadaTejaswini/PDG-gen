import java.io.BufferedReader;
import java.io.IOException;
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
		PuyoPuyo(param, br);

	}

	static void PuyoPuyo(String[] param, BufferedReader br) throws IOException {

		String line = "";
		int A = Integer.parseInt(param[0]);
		int B = Integer.parseInt(param[1]);
		boolean flag = false;
		int point = -1;

		for (int i = 0; i < A; i++) {
			line += br.readLine() + " "; //
		}
		String[] AA = line.split(" ");
		line = "";
		for (int i = 0; i < B; i++) {
			line += br.readLine() + " ";
		}
		String[] BB = line.split(" ");
		if(AA.length < 4) System.exit(0);

		for (int i = 0; i < (AA.length - BB.length) + 1; i++) {
			if (BB.length == 1) {
				if (AA[i].indexOf(BB[0]) != -1) {
					flag = true;
				}
				break;
			}
			while (true) {
				point = AA[i].indexOf(BB[0], point + 1); //
				if (point != -1) {
					for (int j = 1; j < BB.length; j++) {
						int point2 = AA[i + j].indexOf(BB[i + j]);//原因
						if (point != point2)
							break;
						if (j == BB.length - 1)
							flag = true;
					}
				} else {
					break;
				}
			}
			if (flag)
				break;
		}
		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}