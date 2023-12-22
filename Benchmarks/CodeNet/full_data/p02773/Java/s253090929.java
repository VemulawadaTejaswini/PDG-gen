import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

 class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		//重複探索用のリスト
		ArrayList<String> StringList = new ArrayList<String>();
		//Map格納用のリスト
		ArrayList<HashMap>mapList=new ArrayList<HashMap>();

		int N = scan.nextInt();
		for(int i=0;i<=N;i++) {
			String S = scan.nextLine();
			//入力された文字がStringListに存在するか調べる
			if(! StringList.contains(S)) {
			//存在しなければ加えて新しいmapを生成してmapListに追加する
				StringList.add(S);
				HashMap<String, Integer>map=new HashMap<String, Integer>();
				map.put(S, 1);
				mapList.add(map);
			//存在する場合、mapListを先頭から探索し、キーが一致するmapのvalueをインクリメントする
			}else {
				for(HashMap map:mapList) {
					if(map.containsKey(S)) {
						int num = (int)map.get(S);
						num++;
						map.put(S, num);
						break;
					}
				}

			}
		}

		//ランク付けするリスト
		ArrayList<String>rankingList=new ArrayList<String>();
		//mapListの0番目のキーをrankingListに登録

		rankingList.add(mapList.get(0).keySet().toString());
		//mapListに入っているmap要素を一つずつ取り出して、rankingListに入っている要素と比較
		for(int i=1;i<mapList.size();i++) {
			//新規に比べるStringの個数をmapListから取得
			String st = mapList.get(i).keySet().toString();
			int newNum =(int)mapList.get(i).get(st.substring(1, st.length()-1));

			//現在rankingListに入っているStringの個数を取得
			int rankingNum = 0;
			for(HashMap map:mapList) {
				if(map.containsKey(rankingList.get(0))) {
					String str = map.keySet().toString();
					rankingNum = (int)map.get(str.substring(1, str.length()-1));
					break;
				}
			}

			if(newNum==rankingNum) {
				String addStr = mapList.get(i).keySet().toString();
				rankingList.add(addStr.substring(1, addStr.length()-1));
			}else if(newNum>rankingNum) {
				rankingList.clear();
				String addStr = mapList.get(i).keySet().toString();
				rankingList.add(addStr.substring(1, addStr.length()-1));
			}
		}

		Collections.sort(rankingList);

		for(String st:rankingList) {
			System.out.println(st);
		}


	}

}