
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		//		new Main().solveB();
		//		new Main().solveB2();
		//		new Main().solveC();
		//		new Main().solveC2();
		new Main().solveD();
	}

	private void solveA() {

		try (Scanner scanner = new Scanner(System.in)) {
			int lineAB = 0;
			int lineBC = 0;
			lineAB = scanner.nextInt();
			lineBC = scanner.nextInt();

			if (lineBC % lineAB == 0) {
				System.out.println(lineAB + lineBC);
			} else {
				System.out.println(lineBC - lineAB);
			}

			System.out.println("");

		}
	}

	/*
	 * 改良版
	 */
	private void solveB2() {

		try (Scanner scanner = new Scanner(System.in)) {
			int numN = 0;
			int numM = 0;
			numN = scanner.nextInt();
			numM = scanner.nextInt();

			Map<Integer, Integer> wkMap = new HashMap<Integer, Integer>();

			for (int i = 0; i < numN; i++) {

				int numK = scanner.nextInt();
				for (int j = 0; j < numK; j++) {
					int foodNum = scanner.nextInt();
					wkMap.merge(foodNum, 1, (oldV, newV) -> oldV + newV);
				}
			}

			int count = 0;
			for (Integer wkInt : wkMap.values()) {
				if (wkInt == numN) {
					count++;
				}
			}
			System.out.println(count);

		}
	}

	/*
	 * 処理長いけど一応AC
	 */
	private void solveB() {

		try (Scanner scanner = new Scanner(System.in)) {
			int nNin = 0;
			int mSyurui = 0;
			String line1 = scanner.nextLine();
			String[] wkStr1 = line1.split(" ");
			nNin = Integer.parseInt(wkStr1[0]);
			mSyurui = Integer.parseInt(wkStr1[1]);

			List<List<Integer>> wkList = new ArrayList<List<Integer>>();

			for (int i = 0; i < nNin; i++) {
				String wk = scanner.nextLine();
				String[] wkStr = wk.split(" ");
				List<Integer> wkInnerList = new ArrayList<Integer>();
				for (int j = 1; j < wkStr.length; j++) {
					wkInnerList.add(Integer.parseInt(wkStr[j]));
				}
				wkList.add(wkInnerList);
			}

			int result = 0;
			List<Integer> alreadyFinishList = new ArrayList<Integer>();
			for (int i = 0; i < wkList.size(); i++) {
				List<Integer> wkInnerList = wkList.get(i);
				for (int i2 = 0; i2 < wkInnerList.size(); i2++) {
					int syokuNum = wkInnerList.get(i2);
					if (alreadyFinishList.contains(syokuNum)) {
						continue;
					}
					if (isContain(nNin, wkList, i, syokuNum)) {
						result++;
					}
					alreadyFinishList.add(syokuNum);
				}

			}
			System.out.println(result);

		}
	}

	private boolean isContain(int nNin, List<List<Integer>> wkList, int i, int syokuNum) {
		int result = 0;
		for (int j = 0; j < nNin; j++) {
			if (i == j || j >= wkList.size()) {
				continue;
			}

			List<Integer> wkSarchList = wkList.get(j);
			if (wkSarchList.contains(syokuNum)) {
				result++;
			}

		}
		return result == nNin - 1;
	}

	private void solveC() {

		try (Scanner scanner = new Scanner(System.in)) {
			int monsterNum = 0;
			monsterNum = scanner.nextInt();
			long[] monsters = new long[monsterNum];
			for (int i = 0; i < monsterNum; i++) {
				monsters[i] = scanner.nextInt();
			}
			System.out.println(maximuKouyakuNArgs(monsters[0], monsters, 0));

		}
	}

	public long maximuKouyakuNArgs(long currentKouyaku, long[] nums, int start) {
		long res = currentKouyaku;
		if (start < nums.length) {
			res = maximumKouyaku2Args(nums[start], currentKouyaku);
			return maximuKouyakuNArgs(res, nums, start + 1);
		} else {
			return res;
		}
	}

	public long maximumKouyaku2Args(long num1, long num2) {
		try {
			long wkVal1;
			long wkVal2;
			if (num1 < num2) {
				wkVal1 = num2;
				wkVal2 = num1;
			} else {
				wkVal1 = num1;
				wkVal2 = num2;
			}
			long res = wkVal1 % wkVal2;
			if (res != 0) {
				return maximumKouyaku2Args(wkVal2, res);
			} else {
				return wkVal2;
			}

		} catch (Exception e) {
			System.out.println("num1 : " + num1 + " / num2:" + num2);
			e.printStackTrace();
			return -1;
		}

	}

	private Map<Integer, Integer> wkHP = new HashMap<Integer, Integer>();

	private int getMinHP(int[] monsters, int minHP) {
		int resultHP = minHP;
		try {
			if (wkHP.get(minHP) != null) {
				return wkHP.get(minHP);
			}
			for (int i = 0; i < monsters.length; i++) {
				if (i == 0) {
					continue;
				}
				if (monsters[i] % monsters[0] == 0) {
					resultHP = Math.min(monsters[0], resultHP);
				} else {
					resultHP = Math.min(monsters[i] % monsters[0], resultHP);
				}
			}
			if (resultHP > 2) {
				resultHP = getMinHP(monsters, resultHP);
			}
			wkHP.put(minHP, resultHP);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultHP;

	}

	private long getMaxKouyaku(long val1, long[] monsters, int currentI) {
		if (currentI == monsters.length) {
			return val1;
		}
		long res = getMaxKouyaku(val1, monsters[currentI]);
		return getMaxKouyaku(res, monsters, currentI + 1);
	}

	private long getMaxKouyaku(long val1, long val2) {

		long res = 0;
		long wkVal1 = val1;
		long wkVal2 = val2;
		if (val1 < val2) {
			wkVal1 = val2;
			wkVal2 = val1;
		}
		res = wkVal1 % wkVal2;
		if (res != 0) {
			return getMaxKouyaku(wkVal2, res);
		}

		return wkVal2;

	}

	private void solveC2() {

		try (Scanner scanner = new Scanner(System.in)) {
			int monsterNum = 0;
			monsterNum = scanner.nextInt();
			long[] monsters = new long[monsterNum];
			for (int i = 0; i < monsterNum; i++) {
				monsters[i] = scanner.nextInt();
			}
			System.out.println(getMaxKouyaku(monsters[0], monsters, 0));

		}
	}

	private void solveD() {

		try (Scanner scanner = new Scanner(System.in)) {
			int numA = scanner.nextInt();
			int numB = scanner.nextInt();
			int numQ = scanner.nextInt();

			long inf = (long) Math.pow(10, 11);
			long[] s = new long[numA + 2];
			//index範囲対象外にならないように、端っこを作っておく
			s[0] = -inf;
			s[numA + 1] = inf;
			for (int i = 1; i < numA + 1; i++) {
				s[i] = scanner.nextLong();
			}
			long[] t = new long[numB + 2];
			//index範囲対象外にならないように、端っこを作っておく
			t[0] = -inf;
			t[numB + 1] = inf;
			for (int i = 1; i < numB + 1; i++) {
				t[i] = scanner.nextLong();
			}
			long[] x = LongStream.range(0, numQ).map(i -> scanner.nextLong()).toArray();

			for (long d : x) {
				long res = Long.MAX_VALUE - 1;
				int sIndex = Arrays.binarySearch(s, d);
				sIndex = sIndex >= 0 ? sIndex : ~sIndex;
				int tIndex = Arrays.binarySearch(t, d);
				tIndex = tIndex >= 0 ? tIndex : ~tIndex;
				for (int i = sIndex - 1; i <= sIndex; i++) {
					for (int j = tIndex - 1; j <= tIndex; j++) {
						long res1 = (long) (Math.abs(d - s[i]) + Math.abs(s[i] - t[j]));
						long res2 = (long) (Math.abs(d - t[j]) + Math.abs(s[i] - t[j]));
						res = Long.min(Long.min(res1, res2), res);
					}
				}
				System.out.println(res);
			}

		}
	}

}