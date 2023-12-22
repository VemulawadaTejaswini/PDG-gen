public class Main {
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), m = sc.nextInt();

		int s[] = new int [n * 2];
		int c[] = new int [m * 2];

		for (int i = 0; i < n; ++i)
		{
			s[i * 2] = sc.nextInt();
			s[i * 2 + 1] = sc.nextInt();
		}

		for (int i = 0; i < m; ++i)
		{
			c[i * 2] = sc.nextInt();
			c[i * 2 + 1] = sc.nextInt();
		}

		for (int i = 0; i < n; ++i)
		{
			int dist = Integer.MAX_VALUE, index = -1;

			for (int j = 0; j < m; ++j)
			{
				int tmp = (int)(Math.pow(s[i * 2] - c[j * 2], 2) + Math.pow(s[i * 2 + 1] - c[j * 2 + 1], 2));

				if (tmp < dist)
				{
					tmp = dist;
					index = j + 1;
				}
			}

			System.out.println(index);
		}
	}
}