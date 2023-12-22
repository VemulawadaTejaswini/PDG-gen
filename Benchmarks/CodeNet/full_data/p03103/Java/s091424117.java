import java.math.BigInteger;
import java.util.*;
import java.util.TreeMap;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int shopNum = sc.nextInt();
		int drinkNum = sc.nextInt();
		Map<Integer, Integer> drinks = new TreeMap<>();
		for(int i = 0; i < shopNum; i++){
			int key = sc.nextInt();
			try {
				int prev = drinks.get(key);
				drinks.put(key, sc.nextInt()+prev);
			}catch(Exception e) {
				drinks.put(key, sc.nextInt());
			}
		}

		BigInteger ans = BigInteger.ZERO;
		for(Map.Entry<Integer, Integer> entry : drinks.entrySet()) {
			if(drinkNum > entry.getValue()) {
				drinkNum -= entry.getValue();
				ans = ans.add(new BigInteger(entry.getKey().toString()).multiply(new BigInteger(entry.getValue().toString())));
			}else {
				ans = ans.add(new BigInteger(String.valueOf(drinkNum)).multiply(new BigInteger(entry.getKey().toString())));
				break;
			}
		}
		System.out.println(ans);
	}
}


