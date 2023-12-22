import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	FastScanner sc;

	void run() {
		sc = new FastScanner();
		String[] cards = new String[3];
		for (int i = 0; i < 3; i++) {
			cards[i] = sc.next();
		}

		int[] cardsNum = new int[3];

		final int PLAYER_A = 0;
		final int PLAYER_B = 1;
		final int PLAYER_C = 2;
		int player = PLAYER_A;

		cardsNum[PLAYER_A] = cards[PLAYER_A].length();
		cardsNum[PLAYER_B] = cards[PLAYER_B].length();
		cardsNum[PLAYER_C] = cards[PLAYER_C].length();

		String winner = "";
		while (true) {
			if (cardsNum[player] == 0) {
				break;
			}
			char tmp = cards[player].charAt(cards[player].length() - cardsNum[player]);
			cardsNum[player] = cardsNum[player] - 1;

			player = Character.getNumericValue(tmp) - 10;
		}

		if (player == PLAYER_A) {
			winner = "A";
		} else if (player == PLAYER_B) {
			winner = "B";
		} else {
			winner = "C";
		}

		System.out.println(winner);
	}
}

class FastScanner {
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

	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
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

	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}