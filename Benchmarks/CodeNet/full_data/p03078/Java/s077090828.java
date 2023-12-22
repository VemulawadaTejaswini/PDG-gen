import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(), Y = sc.nextInt(), Z = sc.nextInt(), K = sc.nextInt();
		Long[] A = new Long[X];
		Long[] B = new Long[Y];
		Long[] C = new Long[Z];
		Long[] AB = new Long[X * Y];
		Long[] ABC = new Long[Math.min(X * Y, K) * Z];

		for(int i = 0; i < X; i++) A[i] = sc.nextLong();
		for(int i = 0; i < Y; i++) B[i] = sc.nextLong();
		for(int i = 0; i < Z; i++) C[i] = sc.nextLong();
		Arrays.sort(C);

		for(int i = 0; i < X; i ++) {
			for(int j = 0; j < Y; j++) {
				AB[i * Y + j] = A[i] + B[j];
			}
		}
		Arrays.sort(AB);

		for(int i = 0; i < Math.min(X * Y, K); i++) {
			for(int j = 0; j < Z; j++) {
				ABC[i * Z + j] = AB[X * Y - i - 1] + C[Z - j - 1];
			}
		}
		Arrays.sort(ABC);

		for(int i = 0; i < K; i++) System.out.println(ABC[ABC.length - i - 1]);
	}
}