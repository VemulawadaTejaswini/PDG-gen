import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nm = toIntArray(sc.nextLine().split(" "));
		int prefectureCount = nm[0];
		int cityCount = nm[1];
		int[] prefectures = new int[cityCount];
		int[] cityInfos = new int[cityCount];
		int[] indexKeys = new int[cityCount];
		for (int i = 0; i < cityCount; i++) {
			int[] py = toIntArray(sc.nextLine().split(" "));
			prefectures[i] = py[0];
			cityInfos[i] = py[1];
			indexKeys[i] = i;
		}
		sort(cityInfos, prefectures, indexKeys, 0, cityCount - 1);
		sortPerPrefecture(prefectures, cityInfos, indexKeys, cityCount);
		int[] sequences = new int[cityCount];
		generateSequence(prefectures, sequences, cityCount);
		sort(indexKeys, prefectures, sequences, 0, cityCount - 1);
		for (int i = 0; i < cityCount; i++) {
			System.out.println(
				leftPad(String.valueOf(prefectures[i])) +
				leftPad(String.valueOf(sequences[i]))
			);
		}
	}
	private static void generateSequence(int[] prefectures, int[] sequences, int count) {
		int seq = 1;
		count--;
		for (int i = 0; i <= count; i++) {
			sequences[i] = seq;
			if (i < count && prefectures[i] != prefectures[i + 1]) {
				seq = 1;
			} else {
				seq++;
			}
		}
	}
	private static void sortPerPrefecture(int[] prefectures, int[] arg1, int[] arg2, int count) {
		for (int j = 1; j < count; j++) {
			int key1 = prefectures[j];
			int key2 = arg1[j];
			int key3 = arg2[j];
			int i = j - 1;
			while ( i>= 0 && prefectures[i] > key1) {
				int n = i + 1;
				prefectures[n] = prefectures[i];
				arg1[n] = arg1[i];
				arg2[n] = arg2[i];
				i--;
			}
			int n = i + 1;
			prefectures[n] = key1;
			arg1[n] = key2;
			arg2[n] = key3;
		}
	}

	private static void sort(int[] target, int[] prefectures, int[] args, int left, int right) {
		if (left >= right) {
			return;
		}
		int p = target[(left+right)/2];
		int l = left, r = right, tmp;
		while (l < r) {
			while (target[l] < p) { l++; }
			while (target[r] > p) { r--; }
			if (l <= r) {
				tmp = target[l]; target[l] = target[r]; target[r] = tmp;
				tmp = prefectures[l]; prefectures[l] = prefectures[r]; prefectures[r] = tmp;
				tmp = args[l]; args[l] = args[r]; args[r] = tmp;
				l++; r--;
			}
		}
		sort(target, prefectures, args, left, r);
		sort(target, prefectures, args, l, right);
	}

	private static String leftPad(String arg) {
		int len = arg.length();
		if (len >= 6) {
			return arg;
		}
		int diff = 6 - len;
		StringBuilder buf = new StringBuilder(diff);
		for (int i = 0; i < diff; i++) {
			buf.append('0');
		}
		return buf.toString().concat(arg);
	}

	private static int[] toIntArray(String[] args) {
		int len = args.length;
		int[] intArray = new int[len];
		for (int i = 0; i < len; i++) {
			intArray[i] = Integer.parseInt(args[i]);
		}
		return intArray;
	}
}
