import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		long ans = 0;
		Map<Long, Integer>shop = new TreeMap<Long,Integer>(); 
		for(int r = 0; r < n; r++) {
			shop.put(scanner.nextLong(), scanner.nextInt());
		}
		for(Long key : shop.keySet()) {
			if(m==0)break;
			if(shop.get(key) > m) {
				ans += m * key;
				m= 0;
			}else {
				ans += key * shop.get(key);
				m-= shop.get(key);
			}
		}
		System.out.println(ans);
		}

	}