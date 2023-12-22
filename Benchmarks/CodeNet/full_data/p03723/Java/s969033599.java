import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		// for (; solver.hasNext();) {
		// solver.readBody(in.readLine());
		// }
	}
}

class Solver {
	int N;
	int cnt;

	public void init() {
		N = 0;
		cnt = 0;
	}

	private class Cookie {
		int min;
		int mid;
		int max;

		Cookie(int a, int b, int c) {
			min = a;
			mid = b;
			max = c;
			if (min > mid) {
				int bk = mid;
				mid = min;
				min = bk;
			}
			if (mid > max) {
				int bk = max;
				max = mid;
				mid = bk;
			}
			if (min > mid) {
				int bk = mid;
				mid = min;
				min = bk;
			}
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + max;
			result = prime * result + mid;
			result = prime * result + min;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Cookie other = (Cookie) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (max != other.max)
				return false;
			if (mid != other.mid)
				return false;
			if (min != other.min)
				return false;
			return true;
		}

		private Solver getOuterType() {
			return Solver.this;
		}
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		int a = Integer.parseInt(strArr[0]);
		int b = Integer.parseInt(strArr[1]);
		int c = Integer.parseInt(strArr[2]);
		HashSet<Cookie> cookieSet = new HashSet<Cookie>();
		int cnt = 0;
		for (; a % 2 == 0 && b % 2 == 0 && c % 2 == 0;) {
			Cookie cookie = new Cookie(a, b, c);
			if (cookieSet.contains(cookie)) {
				cnt = -1;
				break;
			}
			cookieSet.add(cookie);
			cnt++;
			int ah = a / 2;
			int bh = b / 2;
			int ch = c / 2;
			a = bh + ch;
			b = ah + ch;
			c = ah + bh;
		}
		System.out.println(cnt);
	}

	public boolean hasNext() {
		return cnt < N;
	}

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;
	}
}
