import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
        sc.close();
    }
    
	//フィールド
    Scanner sc;
    int N;
    Map<String,Integer> map = new TreeMap<String,Integer>();
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
    }
    
    //解答処理
    private List<String> solve() {
    	int max = 0;
        List<String> answer = new ArrayList<String>();
        
        for (int i=0; i<N; i++) {
        	String S = sc.next();
        	//キーが既にある場合は値を増やして上書き
        	if (map.containsKey(S)) {
        		map.put(S, map.get(S)+1);
        	} else {
        		map.put(S, 1);
        	}
        }
        
        //最大値の算出
        for (String S : map.keySet()) {
        	max = Math.max(max, map.get(S));
        }
        
        //最大回数のキーをリストに格納
        for (String S : map.keySet()) {
        	if (max == map.get(S)) {
        		answer.add(S);
        	}
        }
        
        return answer;
    }
    
    //出力
    public void show(List<String> answer) {
        for (int i=0; i<answer.size(); i++) {
        	System.out.println(answer.get(i));
        }
    }

}
