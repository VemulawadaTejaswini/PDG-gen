import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

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
    String[] S;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        S = new String[N];
        for (int i=0; i<N; i++) {
        	S[i] = sc.next();
        }
    }
    
    //解答処理
    private List<String> solve() {
    	int max = 0;
    	HashMap<String,Integer> map = new HashMap<String,Integer>();
    	List<String> list = new ArrayList<String>();
    	
    	for (int i=0; i<N; i++) {
    		int count = 1;
    		if (map.containsKey(S[i])) {
    			count += map.get(S[i]);
    		}
    		map.put(S[i], count);
    	}
    	
    	for (String s : map.keySet()) {
    		max = Math.max(max, map.get(s));
    	}
    	for (String s : map.keySet()) {
    		if (max == map.get(s)) {
				list.add(s);
			}
    	}
        
    	Collections.sort(list);
        return list;
    }
    
    //出力
    public void show(List<String> answer) {
    	for (String s : answer) {
    		System.out.println(s);  		
    	}
    }

}
