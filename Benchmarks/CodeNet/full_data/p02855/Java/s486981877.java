import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());

		String[] s = new String[H];
		for (int i = 0; i < H; i++) {
			s[i] = sc.next();
		}

		sc.close();

		int index = 1;
		int rowCount = 0;
		String ret = "";
		String lastRet = "";
		for (int tate = 0; tate < H; tate++) {
			Boolean strExi = false;
			int count = 0;
			ret = "";
			for (int yoko = 0; yoko < W; yoko++) {
				if (s[tate].charAt(yoko) == '#') {
					strExi = true;
					ret += indexStr(index, count + 1);
					count = 0;
					index++;
				} else {
					count++;
				}
			}
			if(!strExi) {
				rowCount++;
				continue;
			}
			if(count != 0) {
				ret += indexStr(index - 1, count);
			}
			for (int i = 1; i <= rowCount + 1; i++) {
				System.out.println(ret);
			}
			rowCount = 0;
			lastRet = ret;

		}
		if(rowCount > 0) {
			for (int i = 1; i <= rowCount; i++) {
				System.out.println(lastRet);
			}
		}


	}

	private static String indexStr(int index, int count) {
		String ret = "";
		for (int i = 0; i < count; i++) {
			ret += index + " ";
		}
		return ret;
	}
}
