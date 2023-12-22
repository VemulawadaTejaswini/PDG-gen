import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {

		// --- input ---
		int num = Integer.parseInt(in.readLine());
		int[] vals = getNums(in.readLine().split(" "), num*3);
		in.close();

		Arrays.parallelSort(vals);
		long sum = 0;
		for(int i=num; i < num*2; i++) {
			sum+=vals[i];
		}

		// --- resolv ---
		System.out.println(sum);
	}
	public static int[] getNums(String[] vals, int num) {
		int[] vAry = new int[num];
		for(int i=0; i < num; i++) {
			vAry[i] = Integer.parseInt(vals[i]);
		}
		return vAry;
	}
}