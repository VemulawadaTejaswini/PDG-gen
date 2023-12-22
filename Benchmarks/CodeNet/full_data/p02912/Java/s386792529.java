import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
        ArrayList<Integer> prices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
          prices.add(sc.nextInt());
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