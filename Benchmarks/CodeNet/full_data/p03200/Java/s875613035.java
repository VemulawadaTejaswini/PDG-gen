import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.BitSet;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	String bitSetToString(BitSet b, int endIndex) {
		StringBuilder sb = new StringBuilder(endIndex + 1);
		for (int i = 0; i < endIndex; i++) {
			sb.append(b.get(i) ? "1" : "0");
		}
		return sb.toString();
	}

	public void _main(String[] args) {
		BitSet b = new BitSet();

		int i = 0;
		int c;
		try {
			while ((c = in.read()) != -1) {
				if (c == 'B') {
					b.set(i++, true);
				} else if (c == 'W') {
					b.set(i++, false);
				}
			}
		} catch (IOException e) {
			return;
		}

		final int TAIL = i - 1;
		int l = b.get(0) ? 0 : b.nextSetBit(0);
		int r = b.get(TAIL) == false ? TAIL : b.previousClearBit(TAIL);
		int ans = 0;
		while (true) {
			if (l >= r || l == -1 || r == -1) {
				break;
			}
			ans += r - l;
			b.clear(l);
			b.set(r);
			l = b.nextSetBit(l);
			r = b.previousClearBit(r);
		}
		out.println(ans);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
