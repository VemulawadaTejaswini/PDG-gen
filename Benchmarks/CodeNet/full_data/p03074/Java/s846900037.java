
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	private void solve() throws IOException {
		try {
			//			solveA();
			//			solveB();
			//			solveC();
			solveD();
			//			 solveE();
			//			 solveF();
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.flush();
				out.close();
			}
		}

	}

	private void solveA() {
		int numA = nextInt();
		int numB = nextInt();

		int cnt = 0;
		for (int i = 0; i < 2; i++) {
			if (numA > numB) {
				cnt += numA;
				numA--;
			} else {
				cnt += numB;
				numB--;
			}
		}

		out.println(cnt);
	}

	private void solveB() {
		int numN = nextInt();
		int[] wk = IntStream.range(0, numN).map(i -> nextInt()).toArray();

		int cnt = 1;
		int baseHeight = wk[0];
		for (int i = 1; i < wk.length; i++) {
			if (wk[i - 1] <= wk[i] && baseHeight <= wk[i]) {
				cnt++;
			}
			baseHeight = Math.max(baseHeight, wk[i]);
		}

		out.println(cnt);
	}

	private void solveC() {
		String[] wk = next().split("");

		int bC = 0;//奇数を白から黒くする
		int wC = 0;//奇数を黒から白くする
		int bC2 = 0;//偶数を白から黒くする
		int wC2 = 0;//偶数を黒から白くする

		for (int i = 0; i < wk.length; i++) {

			if (i % 2 != 0) {
				if (wk[i].equals("0")) {
					//奇数を白くするときの回数
					wC++;
				} else {
					//奇数を黒くするときの回数
					bC++;
				}
			} else {
				if (wk[i].equals("0")) {
					//偶数を白くするときの回数
					wC2++;
				} else {
					//偶数を黒くするときの回数
					bC2++;
				}

			}
		}

		int val1 = bC + wC2;
		int val2 = bC2 + wC;
		out.println(Math.min(val1, val2));
	}

	/*
	 * 実行時間が短い版
	 * 尺取り法
	 */
	private void solveD2() {
		int numN = nextInt();
		int numK = nextInt();
		String[] wk = next().split("");

		List<Integer> oneZeroList = new ArrayList<Integer>();
		//今見ている数
		int now = 1;
		//いくつこの数が続いているのか
		int cnt = 0;
		/*
		 * 1-0-1-0-1
		 */
		for (int i = 0; i < wk.length; i++) {

			/*
			 * iが0か1かを判定している
			 * wk[i].charAt(0) == (char) ('0' + now)
			 */
			if (wk[i].charAt(0) == (char) ('0' + now)) {
				cnt++;
			} else {
				oneZeroList.add(cnt);
				cnt = 1;
				/*
				 * 0と1を切り替えるテクニック
				 * now ^=1でのおｋ
				 */
				now = 1 - now;
			}

		}
		/*
		 * 0のまま、または、1のまま終わった場合の処理
		 */
		if (cnt != 0) {
			oneZeroList.add(cnt);
		}
		/*
		 * 1-0-1-0-1-0-1の配列が欲しい
		 * 1-0-1-0-1-0 で終わっていたら1を足す
		 */
		if (oneZeroList.size() % 2 == 0) {
			oneZeroList.add(0);
		}

		/*
		 * 進んでいく数
		 * 2*Kなのは、
		 * 0をK個数える
		 * ただし、0をK個数えるときには1も同時にK個数えないといけない
		 * そして、1で挟むためには+1
		 *
		 * 1-0-1-0-1-0-1-0-1
		 * 上記の配列を生成しておいたとき、
		 * K=2とすると以下のように数えたい。
		 * 1-0-1-0-1
		 *     1-0-1-0-1
		 *         1-0-1-0-1
		 * そのため、配列を数えていく単位は 2*K+1
		 */
		int countRange = 2 * numK + 1;
		int res = 0;

		/*
		 * forループの外側にleft/rightを持つ
		 */
		int left = 0;
		int right = 0;

		/*
		 *  [left, right) のsum
		 *  ->半開区間
		 *  left以上、right未満
		 *  ()　より大きい、より小さい -> 両端を含まない
		 *  []　以上、以下 -> 両端を含む
		 */
		int temp = 0;

		/*
		 * 1-0-1-0-1....と詰まっているのを数え上げていく
		 * なので、奇数番しか使わない
		 */

		/*
		 * List実装
		 */
		for (int i = 0; i < oneZeroList.size(); i += 2) {

			/*
			 * 次のleft,rightを計算する
			 */
			int nextLeft = i;
			int nextRight = Math.min(i + countRange, oneZeroList.size());

			//左端を移動する
			while (nextLeft > left) {
				temp -= oneZeroList.get(left);
				left++;

			}

			//右端を移動する
			while (nextRight > right) {
				temp += oneZeroList.get(right);
				right++;
			}
			res = Math.max(res, temp);
		}

		out.println(res);

	}

	/*
	 * 実行時間が短い版
	 * 累積和
	 */
	private void solveD() {
		int numN = nextInt();
		int numK = nextInt();
		String[] wk = next().split("");

		List<Integer> oneZeroList = new ArrayList<Integer>();
		//今見ている数
		int now = 1;
		//いくつこの数が続いているのか
		int cnt = 0;
		/*
		 * 1-0-1-0-1
		 */
		for (int i = 0; i < wk.length; i++) {

			/*
			 * iが0か1かを判定している
			 * wk[i].charAt(0) == (char) ('0' + now)
			 */
			if (wk[i].charAt(0) == (char) ('0' + now)) {
				cnt++;
			} else {
				oneZeroList.add(cnt);
				cnt = 1;
				/*
				 * 0と1を切り替えるテクニック
				 * now ^=1でのおｋ
				 */
				now = 1 - now;
			}

		}
		/*
		 * 0のまま、または、1のまま終わった場合の処理
		 */
		if (cnt != 0) {
			oneZeroList.add(cnt);
		}
		/*
		 * 1-0-1-0-1-0-1の配列が欲しい
		 * 1-0-1-0-1-0 で終わっていたら1を足す
		 */
		if (oneZeroList.size() % 2 == 0) {
			oneZeroList.add(0);
		}

		/*
		 * 進んでいく数
		 * 2*Kなのは、
		 * 0をK個数える
		 * ただし、0をK個数えるときには1も同時にK個数えないといけない
		 * そして、1で挟むためには+1
		 *
		 * 1-0-1-0-1-0-1-0-1
		 * 上記の配列を生成しておいたとき、
		 * K=2とすると以下のように数えたい。
		 * 1-0-1-0-1
		 *     1-0-1-0-1
		 *         1-0-1-0-1
		 * そのため、配列を数えていく単位は 2*K+1
		 */
		int countRange = 2 * numK + 1;

		int[] resList = new int[oneZeroList.size() + 1];

		for (int j = 0; j < wk.length; j++) {
			resList[j + 1] = resList[j] + oneZeroList.get(j);
		}

		int res = 0;

		/*
		 *  [left, right) のsum
		 *  ->半開区間
		 *  left以上、right未満
		 *  ()　より大きい、より小さい -> 両端を含まない
		 *  []　以上、以下 -> 両端を含む
		 */

		/*
		 * 1-0-1-0-1....と詰まっているのを数え上げていく
		 * なので、奇数番しか使わない
		 */
		for (int i = 0; i < oneZeroList.size(); i += 2) {

			int left = i;
			int right = Math.min(i + countRange, oneZeroList.size());
			int temp = resList[right] - resList[left];
			res = Math.max(res, temp);
		}

		out.println(res);

	}

	/*
	 * 実行時間が長い版
	 */
	private void solveD3() {
		int numN = nextInt();
		int numK = nextInt();
		String[] wk = next().split("");

		List<Integer> oneZeroList = new ArrayList<Integer>();
		//今見ている数
		int now = 1;
		//いくつこの数が続いているのか
		int cnt = 0;
		/*
		 * 1-0-1-0-1
		 */
		for (int i = 0; i < wk.length; i++) {

			/*
			 * iが0か1かを判定している
			 * wk[i].charAt(0) == (char) ('0' + now)
			 */
			if (wk[i].charAt(0) == (char) ('0' + now)) {
				cnt++;
			} else {
				oneZeroList.add(cnt);
				cnt = 1;
				/*
				 * 0と1を切り替えるテクニック
				 * now ^=1でのおｋ
				 */
				now = 1 - now;
			}

		}
		/*
		 * 0のまま、または、1のまま終わった場合の処理
		 */
		if (cnt != 0) {
			oneZeroList.add(cnt);
		}
		/*
		 * 1-0-1-0-1-0-1の配列が欲しい
		 * 1-0-1-0-1-0 で終わっていたら1を足す
		 */
		if (oneZeroList.size() % 2 == 0) {
			oneZeroList.add(0);
		}

		/*
		 * 進んでいく数
		 * 2*Kなのは、
		 * 0をK個数える
		 * ただし、0をK個数えるときには1も同時にK個数えないといけない
		 * そして、1で挟むためには+1
		 *
		 * 1-0-1-0-1-0-1-0-1
		 * 上記の配列を生成しておいたとき、
		 * K=2とすると以下のように数えたい。
		 * 1-0-1-0-1
		 *     1-0-1-0-1
		 *         1-0-1-0-1
		 * そのため、配列を数えていく単位は 2*K+1
		 */
		int countRange = 2 * numK + 1;
		int res = 0;

		/*
		 * 1-0-1-0-1....と詰まっているのを数え上げていく
		 * なので、奇数番しか使わない
		 */
		for (int i = 0; i < oneZeroList.size(); i += 2) {

			int temp = 0;
			int left = i;
			int right = Math.min(i + countRange, oneZeroList.size());
			/*
			 * 選択位置から、countRange内の個数を数える
			 */
			for (int j = left; j < right; j++) {
				temp += oneZeroList.get(j);
			}
			res = Math.max(res, temp);
		}

		out.println(res);

	}

	/**
	 * 本番中のロジック
	 * 退避しておく
	 */
	private void solveDHonban() {
		int numN = nextInt();
		int numK = nextInt();
		String[] wk = next().split("");

		int[][] resA = new int[numN][2];
		int resAnum = 0;
		List<Integer> firstList = new ArrayList<Integer>();
		firstList.add(0);
		//最初の判定をしておく
		if (wk[0].equals("0")) {
			resA[resAnum][0] = 0;
			resA[resAnum][1] = 1;
		} else {
			resA[resAnum][0] = 1;
			resA[resAnum][1] = 1;
		}
		for (int i = 1; i < wk.length; i++) {
			if (wk[i].equals(wk[i - 1])) {
				resA[resAnum][1] += 1;
			} else {
				resAnum++;
				resA[resAnum][0] = Integer.parseInt(wk[i]);
				resA[resAnum][1] = 1;
				if (wk[i].equals("0")) {
					firstList.add(resAnum - 1);
				}
			}
		}

		int totalRes = 0;

		for (Integer first : firstList) {

			int res = 0;
			int cnt = numK;
			int zeroCnt = 0;
			for (int i = first; i < resA.length; i++) {
				if (resA[i][0] == 0) {
					cnt--;
					zeroCnt++;
					if (cnt >= 0) {
						res += resA[i][1];
					} else {
						break;
					}
				} else if (resA[i][0] == 1) {
					res += resA[i][1];
				}
			}
			if (zeroCnt > 0) {
				totalRes = Math.max(totalRes, res);
			}

		}

		out.println(totalRes);
	}

	private void solveE() {
		int numN = nextInt();

		out.println("");
	}

	private void solveF() {
		int numN = nextInt();

		out.println("");
	}

	private final PrintWriter out = new PrintWriter(System.out);
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}

	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
	}

	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
}