import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] order = new int[N];
		for(int i = 0; i < N; i++){
			order[i] = i;
		}

		double[] X = new double[N];
		double[] Y = new double[N];

		for(int i = 0; i < N; i++){
			X[i] = sc.nextDouble();
			Y[i] = sc.nextDouble();
		}

		double sum = 0;
		int count = 0;
		do{
			
			for(int i = 0; i < N - 1; i++){
				double d = distance(X[order[i]], Y[order[i]], X[order[i + 1]], Y[order[i + 1]]);
				sum += d;
			}
			count++;
		}while(nextPermutation(order));
		System.out.println(sum / count);
	}

	private static boolean nextPermutation(int[] array) {
		for (int i = array.length - 1 ; i > 0 ; i --) {
			if (array[i - 1] < array[i]) {
				int j = find(array, array[i - 1], i, array.length - 1);
				int temp = array[j];
				array[j] = array[i - 1];
				array[i - 1] = temp;
				Arrays.sort(array, i, array.length);
				return true;
			}
		}
		return false;
	}

	private static int find(int[] array, int dest, int f, int l) {
		if (f == l) {
			return f;
		}
		int m = (f + l + 1) / 2;
		return (array[m] <= dest) ? find(array, dest, f, m - 1) : find(array, dest, m, l);
	}
	
	private static double distance(double x1, double y1, double x2, double y2) {
		return(Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
	}
}