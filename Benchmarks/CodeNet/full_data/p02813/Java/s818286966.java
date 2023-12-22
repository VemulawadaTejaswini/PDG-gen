import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int depth = Integer.parseInt(sc.nextLine());
		int[] A = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int[] numStr = A.clone();
		int[] B = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int[] ans = new int[2];

		Arrays.sort(numStr);

		Main main = new Main();
		int[] con = new int[1];
		ans = main.searchPermutation(numStr, new boolean[depth], new int[depth], depth, 0,A,B,new int[2],con);

		System.out.println(Math.abs(ans[0] - ans[1]));
	}

	public int[] searchPermutation(int[] numStr,boolean[] flgs,int[] outStr,int depth,int steps,int[] A,int[] B,int[] ans,int[] con) {
		if (steps == depth) {
			con[0]++;
			int Aflg = 0;
			int Bflg = 0;
			for (int i = 0; i < depth; i++) {
				if (outStr[i] == A[i]) {
					Aflg++;
				}
				if (outStr[i] == B[i]) {
					Bflg++;
				}
			}

			if (Aflg == depth) {
				ans[0] = con[0];
			}
			if (Bflg == depth) {
				ans[1] = con[0];
			}
		}else {
			for (int i = 0; i < numStr.length; i++) {
				if (flgs[i] == false) {
					flgs[i] = true;
					outStr[steps] = numStr[i];
					searchPermutation(numStr, flgs, outStr, depth, steps + 1,A,B,ans,con);
					flgs[i] = false;
				}
			}
		}
		return ans;
	}

}