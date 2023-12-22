import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
        ArrayList<Integer> prices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
          prices.add(Integer.parseInt(sc.next()));
        }
        for (int i = 0; i < m; i++) {
          Collections.sort(prices, Collections.reverseOrder());
          prices.set(0, (int)((double)prices.get(0) / 2));
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
          ans += prices.get(i);
        }
        
		// 出力
		System.out.println(ans);
	}
}