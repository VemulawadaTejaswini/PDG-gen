import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];

		for(int i = 0; i < N; i++)
		{
			A[i] = sc.nextInt();
		}

		int count = 0;
		for(int i = 0; i < N; i++)
		{
			for(int j = i; j < N; j++)
			{
				if(i == j)
				{
					continue;
				}

				for(int k = 0; k < 0; k++)
				{
					if(A[j] == A[k])
					{
						count++;
					}
				}
			}
		}

		System.out.println(count);
	}
}
