import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {

		// --- input ---
		int[] l1 = getNums(in.readLine().split(" "), 2);
		int[] vals = getNums(in.readLine().split(" "), l1[0]);
		in.close();

		// --- resolv ---
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int v : vals) {
			if(map.containsKey(v)) {
				map.put(v, map.get(v) + 1);
			} else {
				map.put(v, 1);
			}
		}

		List<Integer> ary = map.values().parallelStream().sorted((a,b)->b-a).collect(Collectors.toList());

		int ans = 0;
		for(int i=0; i < ary.size(); i++) {
			if(i < l1[1]) {
				continue;
			}
			ans += (int)ary.get(i);
		}

		System.out.println(ans);
	}

	public static int[] getNums(String[] vals, int num) {
		int[] vAry = new int[num];
		for(int i=0; i < num; i++) {
			vAry[i] = Integer.parseInt(vals[i]);
		}
		return vAry;
	}
}