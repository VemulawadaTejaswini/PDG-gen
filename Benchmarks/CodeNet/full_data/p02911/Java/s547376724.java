public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		List<Integer> AArr = new ArrayList<Integer>();

		int N = sc.nextInt();

		int K = sc.nextInt();

		int Q = sc.nextInt();

		for(int i = 0;i<Q;i++)
		{
			int A = sc.nextInt();
			AArr.add(A - 1);
		}

		List<Integer> nArr = new ArrayList<Integer>();

		for(int i = 0;i<N;i++)
		{
			nArr.add(K);
		}

		for(int i = 0;i<Q;i++)
		{
			int tmp = AArr.get(i);

			for(int j = 0 ; j < nArr.size();j++)
			{
				if(j != tmp) {
					nArr.set(j, nArr.get(j) - 1);
				}

			}
		}

		for(int i = 0;i<N;i++)
		{
			if(nArr.get(i) <= 0) {
				System.out.println("No");
			}
			else
			{
				System.out.println("Yes");
			}

		}

	}