import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int x = scanner.nextInt();
		int [] t = new int[N];
		for(int i = 0; i < N; ++i)
		{
			t[i] = scanner.nextInt();
		}
		int min = min(t);
		System.out.println((N - 1) * x + N * min);
	}

	public static int min(int [] num)
	{
		int min = num[0];
		for(int n : num)
		{
			if(n < min)
			{
				min = n;
			}
		}
		return min;
	}
}
