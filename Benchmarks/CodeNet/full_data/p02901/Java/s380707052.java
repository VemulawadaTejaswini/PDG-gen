import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	Main(){}
	
	public void calc() {
		Scanner sc = new Scanner(System.in);
		String[] firstLine = sc.nextLine().split(" ");
		final int n = Integer.parseInt(firstLine[0]);
		final int m = Integer.parseInt(firstLine[1]);
		
		final int inf = 100000000;
		int[] dp = new int[5000];
		
		for(int i = 0; i < 5000 ; i++) {
			dp[i] = inf;
		}
		
		ArrayList<Key> keyList = new ArrayList<>();		
		for(int i = 0; i < m; i++) {
			String[] keyInfo = sc.nextLine().split(" ");
			int keyValue = Integer.parseInt(keyInfo[0]);
			String[] lockableTreasures = sc.nextLine().split(" ");
			keyList.add(new Key(keyValue, lockableTreasures));
		}
		
		sc.close();
		
		
//		Comparator<Key> comparator = Comparator.comparing(Key::getPrice);
//		keyList.sort(comparator);
		
		int lockedItemNum = 0;
		int[] lockedArr = new int[n];
		int priceSum = 0;
        dp[0] = 0;
		
		for(int i = 0; i < m; i++) {
//			String[] lockItems = keyList.get(i).lockItems;
//			boolean isBuy = false;
//			for(String item : lockItems) {
//				int itemNo = Integer.parseInt(item);
//				if(lockedArr[itemNo - 1] == 0 ) {
//					lockedArr[itemNo - 1] = 1;
//					lockedItemNum++;
//					isBuy = true;
//				}
//			}
//			if(isBuy) {
//				priceSum += keyList.get(i).getPrice();
//			}
//			if(lockedItemNum == n) {
//				break;
//			}
			
			int now = 0;
			String[] lockItems = keyList.get(i).lockItems;
			for(String item : lockItems) {
				int itemNo = Integer.parseInt(item);
				now |= (1 << (itemNo - 1));
			}
			
			for(int bit = 0 ; bit < (1 << n) ; bit++) {
				if(dp[bit | now] > dp[bit] + keyList.get(i).getPrice()) {
					dp[bit | now] = dp[bit] + keyList.get(i).getPrice();
				}
			}
		}
		
//		if(lockedItemNum < n) {
//			System.out.println(-1);
//		}else {
//			System.out.println(priceSum);
//		}
		
		if(dp[(1 << n) - 1] == inf) {
			dp[(1 << n) - 1] = -1; 
		}
		System.out.println(dp[(1 << n) - 1]);
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.calc();
	}
	
	public class Key{
		int price;
		String[] lockItems;
		
		public Key(int price, String[] lockItems) {
			this.price = price;
			this.lockItems = lockItems;
		}
		
		public int getPrice() {
			return this.price;
		}
		
		public String getLockItemStr() {
			return Arrays.toString(lockItems);
		}
	}
}
