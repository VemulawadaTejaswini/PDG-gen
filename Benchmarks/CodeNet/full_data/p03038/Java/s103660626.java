import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String[] str = line.split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		String[] str2 = reader.readLine().split(" ");
		long[] A = new long[N];
		//ArrayList <Integer> list = new ArrayList <Integer>();
		for (int i = 0; i < N; i++) {
			A[i] = Long.parseLong(str2[i]);
			//list.add(A[i]);
		}
		Arrays.sort(A);  //小さい順
		int[] B = new int[M];
		long[] C = new long[M];
		for (int i = 0; i < M; i++) {
			line = reader.readLine();
			String[] BC = line.split(" ");
			B[i] = Integer.parseInt(BC[0]);
			C[i] = Long.parseLong(BC[1]);
		}
		Sort s = new Sort(C);
		int count = 0;
		outer:
		for (int k = 0; k < M; k++) {
			//System.out.println("s.array[" + k + "]=" + s.array[k]);     //////////////
			//System.out.println("B[s.index["+ k + "]]=" + B[s.index[k]]);     //////////////
			for (int i = 0; i < B[s.index[k]]; i++) {
				if (s.array[k] >= A[i + count]) {
					A[i + count] = s.array[k];
					//System.out.println("A[" + i +"+" + count + "]=" + A[i+count]);     //////////////
				}
				else {
					break outer;
				}
			}
			count += B[s.index[k]];
		}
		long ans = 0;
		for (int i = 0; i < N; i++) {
			ans += A[i];
			//System.out.println("A[i]=" + A[i]);   //////////
		}
		System.out.println(ans);
	}
	
	
	static class Sort {
		private long[] array;
		private int[] index;
		Sort(long[] c) {
			array = c.clone();
			index = new int[c.length];
			for (int i = 0; i < c.length; i++) {
				index[i] = i;
			}
			combsort_big();   /////////////
		}

		//コムソート(小さい順)
		public void combsort_small() {
			try {
				int h = array.length * 10 / 13;
				while (true) {
					boolean flag = false;
					for (int i = 0; i+h < array.length; i++) {
						if (array[i] > array[i+h]) {
							swap (i, i+h);
							flag = true;
						}
					}
					if (h == 1) {
						if (!flag) {
							break;
						}
					}
					else {
						h = h * 10 / 13;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		//コムソート(大きい順)
		public void combsort_big() {
			try {
				int h = array.length * 10 / 13;
				while (true) {
					boolean flag = false;
					for (int i = 0; i+h < array.length; i++) {
						if (array[i] < array[i+h]) {
							swap (i, i+h);
							flag = true;
						}
					}
					if (h == 1) {
						if (!flag) {
							break;
						}
					}
					else {
						h = h * 10 / 13;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		//配列のi番目とj番目を入れ替え
		public void swap (int i, int j) {
			long t = array[i];
			array[i] = array[j];
			array[j] = t;
			t = index[i];
			index[i] = index[j];
			index[j] = (int) t;
		}
	}
}