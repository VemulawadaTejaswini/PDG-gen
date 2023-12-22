import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sn = new Scanner(System.in);
		
		int n = Integer.valueOf(sn.nextLine());
		String[] ss = new String[n];
		for (int i = 0; i < n; i++) {
			char[] c = sn.nextLine().toCharArray();
			Arrays.sort(c);
			ss[i] = new String(c);
		}
		
		Arrays.sort(ss);

		int cnt = 0;
		for (int i = 0; i < n; i++) {
			cnt = calcSameCnt(ss, i, 1, cnt);
		}
		
		System.out.println(cnt);
	}
	
	private static int calcSameCnt(String[] ss, int tempIndex, int addIndex, int cnt) {
		int nextIndex = tempIndex + addIndex;
		if (nextIndex >= ss.length) {
			return cnt;
		}
		
		if (!ss[tempIndex].equals(ss[nextIndex])) {
			return cnt;
		}
		
		return calcSameCnt(ss, tempIndex, addIndex + 1, ++cnt);
	}
}
