import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// get a integer
		int N = sc.nextInt();
        long arrA[] = new long[N];
		long arrB[] = new long[N];

		for (int i = 0; i < N; i++) {
			arrA[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			arrB[i] = sc.nextInt();
		}
		
		System.out.println(Main.possSeqMount(arrA, arrB, N));
		sc.close();
	}
	
	static long possSeqMount(long[] a, long[] b, int size) {
		long f1 = a[size-1];
		long f2 = b[0];
		long result = 1;
		
		if (f1 != f2)
			return 0;
		else {
			for (int i = 1; i < size - 1; i++)
			{
				if (a[i] < b[i]) {
					result = (result * a[i]) % ((int) Math.pow(10, 9)+7);
				}
				else if (a[i] > b[i]) {
					result = (result * b[i]) % ((int) Math.pow(10, 9)+7);
				}
			}
		}
		return result;
	}
}