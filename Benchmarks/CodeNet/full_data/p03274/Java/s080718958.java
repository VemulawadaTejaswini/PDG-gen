import java.util.Scanner;
public class Main {

	static int N, K,MIN = 999999999,INDEX0,START,END;
	static int[] initArr, num_line;
	static boolean has0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		initArr = new int[N];
		num_line = new int[N + 1];
		for (int i = 0; i < N; i++) {
			initArr[i] = sc.nextInt();
			if(initArr[i] == 0) {
				INDEX0 = i;
				has0 = true;
			}
		}
		if(!has0) {
			boolean flagZ = false;
			boolean flagF = false;
			if (initArr[0] > 0) {
				INDEX0 = 0;
				num_line[0] = 0;
				flagZ = true;
			}
			if (initArr[N - 1] < 0) {
				INDEX0 = N;
				num_line[N] = 0;
				flagF = true;
			}
			if (!flagZ && !flagF) {
				for (int i = 0; i < initArr.length; i++) {
					int temp = initArr[i + 1];
					if (temp > 0) {
						INDEX0 = i + 1;
						num_line[i] = 0;
						break;
					}
				}
			}
			for (int i = 0; i < N; i++) {
				if (flagF) {
					num_line[i] = initArr[i];
				} else if (flagZ) {
					num_line[i + 1] = initArr[i];
				} else {
					int temp = initArr[i];
					if (temp < 0) {
						num_line[i] = temp;
					} else {
						num_line[i + 1] = temp;
					}
				}
			}
		}else {
			num_line = initArr;
		}
		if(INDEX0 == 0) {
			START = 0;
			END = K;
		}else if (INDEX0 == N) {
			START = N - K;
			END = N;
		}else {
			START = INDEX0 > K ? INDEX0 - K : 0;
			END = (N - INDEX0) > K ? INDEX0 + K : N;
		}
		if(has0) {
			END--;
			K--;
		}
		for (int i = START; i <= END - K; i++) {
			int left = Math.abs(num_line[i]);
			int right = Math.abs(num_line[i + K]);
			int min = left < right ? left : right;
			int size = left + right + min;
			MIN = size < MIN ? size : MIN;
		}
		System.out.println(MIN);
	}
}
