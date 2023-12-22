import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] value = new int[N];
		for(int i = 0; i < N; i++)
		{
			value[i] = sc.nextInt();
		}

		value =  sort(value, N);

		double alchemyResult = ((double)value[0] + (double)value[1]) / 2;

		for(int i = 2; i < N; i++)
		{
			alchemyResult = (alchemyResult + (double)value[i]) / 2;
		}

		System.out.println(alchemyResult);
		sc.close();
	}

	private static int[] sort(int[] a, int N) {
		for(int i = 0; i < N; i++) {
			for(int j = N-1; 0 <= j; j--)
			{
				if(i == j) break;
				if(a[j] < a[j-1])
				{
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		return a;
	}
}