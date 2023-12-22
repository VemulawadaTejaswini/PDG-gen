import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(bf.readLine());

			// 各頂点ごとにつながっている頂点リストを作成していく
			// ※頂点番号1から埋めていく
			// List　：　Key→頂点番号、Value→頂点につながっている[頂点、距離]Map
			List<Map<Integer, Integer>> connectList = new ArrayList<Map<Integer, Integer>>();
			for (int i = 0; i < n; i++) {
				connectList.add(new HashMap<Integer, Integer>());
			}
			for (int i = 0; i < n - 1; i++) {
				String[] input = bf.readLine().split(" ");
				int from = Integer.parseInt(input[0]);
				int to = Integer.parseInt(input[1]);
				int range = Integer.parseInt(input[2]);
				putConnectMap(connectList, from, to, range);
				putConnectMap(connectList, to, from, range);
			}

			// 各頂点間の道順を作る
			// ※頂点番号1から順に、1→2～n、2→3～n、…、n-1→nまで探索
			// List1　：　Key→頂点番号、Value→ゴールの頂点List
			// List2　：　Key→ゴールの頂点、Value→道順をあらわすarrays
			List<List<Integer[]>> routeList = new ArrayList<List<Integer[]>>(n);
			for (int i = 0; i < n - 1; i++) {
				List<Integer[]> routeSubList = new ArrayList<Integer[]>();
				for (int j = i + 1; j < n; j++) {

					// ルート探索
					// ※作成されたルートはゴールから辿る順に格納されている
					int fromId = i + 1;
					int goalId = j + 1;
					List<Integer> route = new ArrayList<Integer>();
					searchRoute(connectList, 0, fromId, goalId, route);

					Integer[] routeArray;
					if (route.size() > 1) {
						routeArray = route.toArray(new Integer[]{});
					} else {
						routeArray = new Integer[]{route.get(0)};
					}
					routeSubList.add(routeArray);
				}
				routeList.add(routeSubList);
			}

			// 各頂点間で偶数距離であるグループの最大公約数を取る
			Set<Integer> evenGroup = new HashSet<Integer>();
			for (int i = 0; i < routeList.size(); i++) {

				// 各頂点から偶数距離である頂点を探索
				Set<Integer> evenSubGroup = new HashSet<Integer>();
				int fromId = i + 1;
				for (Integer[] route : routeList.get(i)) {

					// 距離を計算
					// ※ゴールからさかのぼるように計算
					int routeRange = 0;
					for (int j = 0; j < route.length; j++) {
						int startId = route[j];
						int nextId = (route.length <= j + 1 ? fromId : route[j + 1]);
						routeRange += connectList.get(startId - 1).get(nextId);
					}
					if (routeRange % 2 == 0) {
						int goalId = route[0];
						evenSubGroup.add(goalId);
					}
				}
				if (!evenSubGroup.isEmpty()) {
					evenSubGroup.add(fromId);
				}

				// 最大公約数を取る
				if (evenGroup.isEmpty()) {
					evenGroup.addAll(evenSubGroup);
				} else if (!evenSubGroup.isEmpty()) {
					evenGroup.retainAll(evenSubGroup);
				}
			}

			// 出力
			for (int i = 1; i <= n; i++) {
				if (evenGroup.contains(i)) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			}
		} catch (IOException e1) {
		}
	}

	private static void putConnectMap(List<Map<Integer, Integer>> connectList, int from, final int to, final int range) {
		int listIdx = from - 1;
		connectList.get(listIdx).put(to, range);
	}

	private static boolean searchRoute(List<Map<Integer, Integer>> connectList, int fromId, int nowId, int goalId, List<Integer> route) {
		boolean ret = false;
		Map<Integer, Integer> connectInfo = connectList.get(nowId - 1);
		for(Map.Entry<Integer, Integer> to : connectInfo.entrySet()) {
			int toId = to.getKey();
			if (toId == fromId) {
				continue;
			}

			if (toId == goalId) {
				ret = true;
			} else {
				ret = searchRoute(connectList, nowId, toId, goalId, route);
			}
			if (ret) {
				route.add(toId);
				break;
			}
		}
		return ret;
	}

}
