import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		ArrayList<String> lines = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			String line = in.nextLine();
			lines.add(line);
		}

		// 第一引数取得
		int totalNum = Integer.parseInt(lines.get(0));
		// 第二引数取得、スペース区切りで分割して配列に入れる
		String str = lines.get(1);
		String strs[] = str.split("\\s");

		// nとn+1の配列
		String[] strOne = new String[totalNum/2];
		String[] strTwo = new String[totalNum/2];

		int m = 0;
		int n = 0;
		for(int i=0; i<totalNum; i++) {
			if(i%2 == 0) {
				strOne[m] = strs[i] ;
				m++;
			}else {
				strTwo[n] = strs[i] ;
				n++;
			}
		}

		// ソートと重複数取得用Map生成
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();

		// strOneの配列をMapへ登録、重複カウント
		for (String s : strOne) {
			int v;
			if (map1.containsKey(s)) {
				// Mapに登録済み
				v = map1.get(s) + 1;
			} else {
				// Mapに未登録
				v = 1;
			}
			map1.put(s, v);
		}

		// strTwoの配列をMapへ登録、重複カウント
		for (String s : strTwo) {
			int v;
			if (map2.containsKey(s)) {
				// Mapに登録済み
				v = map2.get(s) + 1;
			} else {
				// Mapに未登録
				v = 1;
			}
			map2.put(s, v);
		}


		// key(String)が数値でvalue(Integer)が重複数
		// Map.Entryのリストを作成する
		List<Entry<String, Integer>> list_entries1 = new ArrayList<Entry<String, Integer>>(map1.entrySet());
		List<Entry<String, Integer>> list_entries2 = new ArrayList<Entry<String, Integer>>(map2.entrySet());

		// 比較関数Comparatorを使用してMap.Entryの値を比較してソート(降順)
		// nの配列
		Collections.sort(list_entries1, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				// 降順
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});
		// n+1の配列
		Collections.sort(list_entries2, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				// 降順
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});

		// 最大重複数を取得
		int dup1 = list_entries1.get(0).getValue();
		int dup2 = list_entries2.get(0).getValue();
		int tmpDup1 = list_entries1.get(0).getValue();
		int tmpDup2 = list_entries2.get(0).getValue();
		int x = 0;
		int variety = 0;
		for (Entry<String, Integer> entry : map1.entrySet()) {
			variety++;
		}

		// 代表番号(重複数が最大の値)を取得
		String Num1 = list_entries1.get(0).getKey();
		String Num2 = list_entries2.get(0).getKey();

		// 重複数が少ない方の配列内で次に重複数が多いものに代入し直す
		// 数値のkeyはString型


		// n配列とn+1配列ともにそれぞれの中で全て重複の場合
		if(dup1 == totalNum/2 && dup2 == totalNum/2) {
			// 引数が2つの場合
			if(strOne.length == 1){
				// n配列とn+1配列の代表番号が同じ場合
				if(Num1.equals(Num2)) {
					System.out.println(1);
					// n配列とn+1配列の代表番号が異なる場合
				}else {
					System.out.println(0);
				}
				// 引数が4つ以上の場合
			}else {
				System.out.println(totalNum/2);
			}
		// n配列とn+1配列で重複でないものを含む場合
		}else {
			// n配列とn+1配列で代表番号が同じ場合
			if(Num1.contentEquals(Num2)) {
				// 引数が2つの場合
				if(strOne.length == 1){
					System.out.println(0);
					return;
				}else {
					// n配列の方が重複数が多い場合
					if(tmpDup1 > tmpDup2) {
						dup1 = list_entries1.get(0).getValue();
						dup2 = list_entries2.get(1).getValue();
					// n+1配列の方が重複数が多い場合
					}else if(tmpDup1 < tmpDup2) {
						dup1 = list_entries1.get(1).getValue();
						dup2 = list_entries2.get(0).getValue();
					// n配列とn+1配列で重複数が同じ場合
					// 2番目に重複数が多いサブ代表番号を比較
					}else {
						tmpDup1 = list_entries1.get(1).getValue();
						tmpDup2 = list_entries2.get(1).getValue();
						// n配列のサブ代表番号の方が重複数が多い場合
						// n配列はサブ代表番号を使う場合
						if(tmpDup1 > tmpDup2) {
							dup1 = list_entries1.get(1).getValue();
							dup2 = list_entries2.get(0).getValue();
						// n+1配列のサブ代表番号の方が重複数が多い場合
						// n+1配列はサブ代表番号を使う場合
						}else if(tmpDup1 < tmpDup2) {
							dup1 = list_entries1.get(0).getValue();
							dup2 = list_entries2.get(1).getValue();
						}
					}
				}
			}
			System.out.println(totalNum - (dup1 + dup2));
		}
	}
}