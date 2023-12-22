import java.util.HashMap;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		SortedSet<KeyValuePair> a = new TreeSet<KeyValuePair>();
		HashMap<Integer, Integer> num = new HashMap<Integer, Integer>();

		for (int i = 1; i <= n; i++) {
			String str = sc.next();
			int z = sc.nextInt() * (-1);

			a.add(new KeyValuePair(z, str));
			num.put(z, i);
			// System.out.println(str + " " + z + " " + i);
		}

		for (KeyValuePair keyValuePair : a) {
			System.out.println(num.get(keyValuePair.key));
		}

		sc.close();
	}
}
class KeyValuePair implements Comparable<KeyValuePair> {
	int key;
	String value;

	public KeyValuePair(int key, String value) {
		super();
		this.key = key;
		this.value = value;
	}

	public int compareTo(KeyValuePair o) {
		return key == o.key ? value.compareTo(o.value) : key - o.key;
	}
}