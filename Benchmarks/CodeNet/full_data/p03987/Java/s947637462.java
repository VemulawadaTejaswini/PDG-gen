import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		Obj[] arr = new Obj[n];
		for (int i = 0; i < n; i++) {
			Obj o = new Obj();
			o.i = i;
			o.a = Integer.parseInt(sa[i]);
			arr[i] = o;
		}
		br.close();

		Arrays.sort(arr, (o1, o2) -> o1.a - o2.a);
		TreeSet<Integer> set = new TreeSet<>();
		set.add(-1);
		set.add(n);
		long ans = 0;
		for (Obj o : arr) {
			long l = o.i - set.lower(o.i);
			long r = set.higher(o.i) - o.i;
			ans += l * r * o.a;
			set.add(o.i);
		}
		System.out.println(ans);
	}

	static class Obj {
		int i, a;
	}
}
