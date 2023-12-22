import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		Map<String, Integer> S = new HashMap<String, Integer>(N);
		for(int i=0; i<N; i++) {
			String s = sc.next();
			if(S.containsKey(s)) {
				int n = S.get(s) + 1;
				S.put(s, n);
			}else {
				S.put(s, 1);
			}
		}

		List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(S.entrySet());

        Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
            //compareを使用して値を比較する
            public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2)
            {
                if(obj2.getValue().intValue() == obj1.getValue().intValue()) {
                	//文字列の昇順
                	return obj1.getKey().compareTo(obj2.getKey());
                }
                else {
                	//数値の降順
                	return obj2.getValue().compareTo(obj1.getValue());
                }
            }
        });

        int max = 0;
        int count = 0;
        List<String> ans = new ArrayList<String>();
        for(Entry<String, Integer> entry : list_entries) {
        	String s = entry.getKey();
        	int value = entry.getValue();

            if(count == 0) {
            	max = value;
            	ans.add(s);
            }else {
            	if(value == max) {
            		ans.add(s);
            	}else {
            		break;
            	}
            }

            count++;
        }

        for(String s: ans) {
        	System.out.println(s);
        }
	}

}