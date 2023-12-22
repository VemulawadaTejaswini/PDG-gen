
	public static void main(String[] args) {
		new Main().solveA();
		// new Main().solveB();
		// new Main().solveC();
		// new Main().solveD();
	}

	int numN = 0;
	int totalWeight = 0;
	int[][] wAndV;
	int[][] iAndWeight;

	private int getValue(int currentI, int nowWeight) {

		if (iAndWeight[currentI][nowWeight] != Integer.MIN_VALUE) {
			return iAndWeight[currentI][nowWeight];
		}
		int res = 0;
		if (currentI == numN) {
			res = 0;
		} else if (nowWeight < wAndV[currentI][0]) {
			res = getValue(currentI + 1, nowWeight);
		} else {
			int value1 = getValue(currentI + 1, nowWeight);
			int value2 = getValue(currentI + 1, nowWeight - wAndV[currentI][0]) + wAndV[currentI][1];
			res = Math.max(value1, value2);
		}
		iAndWeight[currentI][nowWeight] = res;
		return res;

	}

	private void solveA() {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			totalWeight = scanner.nextInt();

			wAndV = new int[numN][2];
			iAndWeight = new int[numN + 1][totalWeight + 1];
			for (int i = 0; i < numN; i++) {
				wAndV[i][0] = scanner.nextInt();
				wAndV[i][1] = scanner.nextInt();
			}

			for (int i = 0; i < iAndWeight.length; i++) {
				Arrays.fill(iAndWeight[i], Integer.MIN_VALUE);
			}
			int res = getValue(0, totalWeight);
			System.out.println(res);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

}