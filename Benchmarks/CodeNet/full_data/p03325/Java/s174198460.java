import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] a = new int[N];
		int max = -1;
		int count = 0;

		for (int i = 0; i < N; i++)
			a[i] = sc.nextInt();

		while(true) {
			for (int i = 0; i < N; i++)
				if (max < a[i] && a[i] % 2 == 0)
					max = i;

			for (int i = 0; i < N; i++)
				if (i != max)
					a[i] = a[i] * 3;
				else
					a[i] = a[i] / 2;

			if (max == -1)
				break;

			count++;
			System.out.println(count);

			max = -1;
		}

		System.out.println(count);
	}
}