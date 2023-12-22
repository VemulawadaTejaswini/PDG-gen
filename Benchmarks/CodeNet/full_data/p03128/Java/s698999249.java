

		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int[] aA = IntStream.range(0, m).map(i -> scanner.nextInt()).toArray();
			final Map<Integer, Integer> CONST_NUM = new HashMap<Integer, Integer>() {
				{
					put(1, 2);
					put(2, 5);
					put(3, 5);
					put(4, 4);
					put(5, 5);
					put(6, 6);
					put(7, 3);
					put(8, 7);
					put(9, 6);
				}
			};
			String[] dp = new String[10009];
			/*
			 * dp[i]の時に、作られている最大の数値
			 * 配るDPで実装
			 */
			//dp[0]の時は、空
			dp[0] = "";
			for (int i = 0; i < 10000; i++) {
				/*
				 * dp[0]のみ初期化しておいて、その後、aA[]に値がないやつは飛ばす
				 * nullという文字列が入ると文字列の最大値判定上困る
				 * null値だったらいいんだけどね。
				 */
				if (dp[i] == null) {
					continue;
				}
				for (int j = 0; j < aA.length; j++) {
					/*
					 * dp[aA[j]の桁を選択した場合のマッチ消費数]
					 * = max(既に格納されている数値 , dp[現在のマッチ消費数]+aA[j]を選択した場合の数値)
					 */
					dp[i + CONST_NUM.get(aA[j])] = max(dp[i + CONST_NUM.get(aA[j])], dp[i] + aA[j]);
				}
			}
			System.out.println(dp[n]);
		}
	