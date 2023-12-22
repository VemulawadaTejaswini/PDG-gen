public class Main {

	public static void main(String[] args) throws java.io.IOException {




		// 弁当の種類

		int N = 0;

		// 列車の本数 (M+1で駅の合計)

		int M = 0;




		java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));




		// 1行読み込み

		String strStdIn = in.readLine();




		// 数値以外の部分で区切る

		String[] strs = strStdIn.split("[^0-9]");




		// 弁当の種類取得

		N = Integer.parseInt(strs[0]);




		// 列車の本数取得

		M = Integer.parseInt(strs[1]);




		// 弁当販売リスト key:弁当の種類 value:弁当の販売区間

		int[][] bentoList = new int[N][];




		int index = 0;




		// 弁当販売リスト取得

		strStdIn = in.readLine();

		while (strStdIn != null && !strStdIn.equals("")) {

			String[] bentoSyurui = strStdIn.split("[^0-9]");




			// 弁当販売開始位置

			int start = Integer.parseInt(bentoSyurui[0]);

			// 弁当販売終端位置

			int end = Integer.parseInt(bentoSyurui[1]);




			// 配列挿入

			bentoList[index] = new int[] { start, end };




			index++;

			strStdIn = in.readLine();

		}




		// 列車本数分繰り返し

		for (int trainCount = 1; trainCount <= M; trainCount++) {




			// 弁当購入判定フラグリスト

			boolean[] kounyuBento = new boolean[N];




			int bentoCount = 0;

			// 停車駅数分繰り返し

			for (int teisyaCount = trainCount; teisyaCount <= M; teisyaCount += trainCount) {

				// 弁当の種類分繰り返し

				for (int i = 0; i < bentoList.length; i++) {

					int[] bento = bentoList[i];

					if (bento[0] <= teisyaCount && teisyaCount <= bento[1]) {

						if (kounyuBento[i] == false) {

							bentoCount++;

							kounyuBento[i] = true;

						}

					}

				}

			}




			// 列車ごとの弁当購入種類出力

			System.out.println(bentoCount);

		}

	}

}