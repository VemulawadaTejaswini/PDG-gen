
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = scanner.nextInt();
		}

		int[][] sumMap = makeSumMap(A, N);
		int[][] xorMap = makeXorMap(A, N);



		int cnt=0;
		for (int i = 0; i < A.length; i++) {
			for (int j = i; j < A.length; j++) {
				if(sumMap[i][j]==xorMap[i][j]) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);

	}

	private static int[][] makeSumMap(int []arr,int size) {
		int [][] sumMap = new int[size][size];
		for(int i=0;i<arr.length;i++) {
			for (int j = i; j >= 0; j--) {
				sumMap[i][j]=(i==j)?arr[i]:sumMap[i-1][j]+sumMap[i][j+1];
			}
		}

		return sumMap;
	}

	private static int[][] makeXorMap(int []arr,int size) {
		int [][] xorMap = new int[size][size];
		for(int i=0;i<arr.length;i++) {
			for (int j = i; j >= 0; j--) {
				xorMap[i][j]=(i==j)?arr[i]:xorMap[i-1][j]^xorMap[i][j+1];
			}
		}

		return xorMap;
	}



}
