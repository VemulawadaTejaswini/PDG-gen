import java.util.ArrayList;
import java.util.Collections;
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
    int[] P;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        N = sc.nextInt();
        S = new String[N];
        P = new int[N];
        for (int i=0; i<N; i++) {
        	S[i] = sc.next();
        	P[i] = sc.nextInt();
        }
    }
    
    //解答処理
    private List<Main9Restaurant> solve() {
    	List<MainRestaurant> restaurant = new ArrayList<MainRestaurant>();
        
    	for (int i=0; i<N; i++) {
    		MainRestaurant res = new MainRestaurant();
    		res.setCity(S[i]); 
    		res.setPoint(P[i]);
    		res.setI(i+1);
    		restaurant.add(res);
    	}
    	
    	Collections.sort(restaurant);
        return restaurant;
    }
    
    //出力
    public void show(List<Main9Restaurant> answer) {
        for (int i=0; i<answer.size(); i++) {
        	System.out.println(answer.get(i));
        }
    }

}


/**
 * ガイドブックに載せるレストランのデータを格納するクラス
 *
 */
public class MainRestaurant implements Comparable<MainRestaurant>{
	private String city;
	private int point;
	private int i;
	
	//public String getCity() {
	//	return city;
	//}
	public void setCity(String city) {
		this.city = city;
	}
	//public int getPoint() {
	//	return point;
	//}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}

	//点数を比較するメソッド
	public int compareTo(MainRestaurant other) {
	    int ans = city.compareTo(other.city);
	    if (ans != 0) return ans;
	    return Integer.compare(other.point, point);
	  }
}
