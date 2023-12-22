import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String p = br.readLine().replace(" ", "");
		String q = br.readLine().replace(" ", "");

		Permutation<String> per = new Permutation<>(p.split(""));

		String str[] = new String[kaizyou(n)];
		int count = 0;
		do {
			String s = "";
			String ss[] = per.getTarget().clone();
			for (int i = 0; i < n; i++) {
				s += ss[i];
			}
			str[count++] = s;
		} while (per.next());

		Arrays.sort(str);

		int a = 0;
		int b = 0;

		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(p)) {
				a = i;
			}
			if (str[i].equals(q)) {
				b = i;
			}
		}

		System.out.println(Math.abs(a - b));
	}

	static int kaizyou(int n) {
		if (n == 0)
			return 1;
		return kaizyou(n - 1) * n;
	}
}

class Permutation<T extends Serializable> {

	private int baseIndex;
	private int index;
	private T[] objs;

	private Permutation<T> subPermutation;

	public Permutation(T[] objs) {
		this(0, 0, objs.clone());
	}

	private Permutation(int baseIndex, int index, T[] objs) {
		if (objs == null || objs.length == 0) {
			throw new IllegalArgumentException();
		}

		this.baseIndex = baseIndex;
		this.index = index;
		this.objs = objs;

		if (this.index < this.objs.length - 1) {
			this.subPermutation = new Permutation<T>(this.baseIndex + 1, this.index + 1, this.objs);
		}
	}

	public T[] getTarget() {
		return this.objs;
	}

	public boolean next() {
		if (this.subPermutation == null) {
			return false;
		}

		boolean result = this.subPermutation.next();
		if (result == true) {
			return true;
		}

		this.swap(this.baseIndex, this.index);

		++this.index;
		if (this.objs.length <= this.index) {
			this.index = this.baseIndex;
			return false;
		}

		this.swap(this.index, this.baseIndex);
		return true;
	}

	private void swap(int index1, int index2) {
		T tmp = this.objs[index1];
		this.objs[index1] = this.objs[index2];
		this.objs[index2] = tmp;
	}
}
