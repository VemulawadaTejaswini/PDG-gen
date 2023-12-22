import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);

		String[] str1 = br.readLine().split(" ");
		int[] A = new int[N];
		for(int i = 0;i<N;i++) {
			A[i] = Integer.parseInt(str1[i]);
		}
		Arrays.sort(A);

		int[] B = new int[M];
		int[] C = new int[M];

		for(int i = 0;i<M;i++) {
			String[] str2 = br.readLine().split(" ");
			B[i] = Integer.parseInt(str2[0]);
			C[i] = Integer.parseInt(str2[1]);
		}

		for(int i=0;i<M;i++) {


			for(int k =1;k<=B[i];k++) {
				if(A[B[i]-k]<C[i]) {
					A[B[i]-k] = C[i];
				}

			}


			Arrays.sort(A);

		}

		long sum = 0;
		for(int i = 0;i<N;i++) {
			sum += A[i];
		}

		System.out.println(sum);

	}

}
