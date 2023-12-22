import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main{

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inStr = br.readLine().split(" ");
		int N = Integer.parseInt(inStr[0]);
		int M = Integer.parseInt(inStr[1]);
		int[][] arr = new int[M][2];
		for (int i = 0; i < M; i++) {
			inStr = br.readLine().split(" ");
			for (int j = 0; j < 2; j++) {
				arr[i][j] = Integer.parseInt(inStr[j]);
			}
		}
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		List<Integer> listSort = new ArrayList<Integer>();
		List<Integer> history = new ArrayList<Integer>();
		for (int i = 0; i < M && !history.contains(arr[i][0]); i++) {
			listSort = new ArrayList<Integer>();
			listSort.add(arr[i][1]);
			for (int j = i + 1; j < M; j++) {
				if (arr[i][0] == arr[j][0]) {
					listSort.add(arr[j][1]);
				}
			}
			Collections.sort(listSort);
			List<Integer> list = new ArrayList<Integer>();
			list.addAll(listSort);
			map.put(arr[i][0], list);

			listSort.clear();

			history.add(arr[i][0]);
		}
		for (int i = 0; i < M; i++) {
			System.out.println(getId(arr[i][0]) + getId(map.get(arr[i][0]).indexOf(arr[i][1]) + 1));
		}
	}

	private static String getId(int num) {
		String str = String.valueOf(num);
		String pNum = "";
		if (str.length() < 6) {
			for (int i = 0; i < 6 - str.length(); i++) {
				pNum += "0";
			}
			pNum += str;
		} else {
			pNum = str;
		}
		return pNum;
	}
}
