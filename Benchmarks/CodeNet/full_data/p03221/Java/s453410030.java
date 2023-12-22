
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {

//		System.setIn(new FileInputStream("D:\\Workspace\\SW\\src\\b\\tt"));
//		long start = System.currentTimeMillis();

		// strat
		// B - ID
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] P = new int[N + 1];
		int[][] arr = new int[M + 1][4];// 0 保存原值P，1保存原值Y， 2排序， 3州内顺序

		for (int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			arr[i][0] = p;
			arr[i][1] = y;
			arr[i][2] = i;
		}

		Comparator<int[]> c = new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1];
			}
		};
		Arrays.sort(arr, c);

		for (int i = 1; i <= M; i++) {
			arr[i][3] = ++P[arr[i][0]];
		}

		Comparator<int[]> c1 = new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[2] - o2[2];
			}
		};
		Arrays.sort(arr, c1);

		for (int i = 1; i <= M; i++) {
			System.out.format("%06d%06d\n", arr[i][0], arr[i][3]);
		}

		// end
//		long end = System.currentTimeMillis();
//		System.out.format("%.3f (s)", (end-start)/1000.0);
	}

}
