import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int ans = 0;
		for(int i=1;i<=num;i++){
			ans += calc(i);
		}
		System.out.println(ans);

	}

	private static int calc(int num) {
		// TODO 自動生成されたメソッド・スタブ
		TreeMap<Integer, Integer> map = prime(num);

		for(Iterator<Integer> it =  map.keySet().iterator();it.hasNext();){
			int key = it.next();
			if(key %2 == 0){
				return 0;
			}
		}

		int totalPrime = 1;
		for(int value: map.values()){
			totalPrime *=(value+1);
		}
		if(totalPrime == 8){
			return 1;
		}else{
			return 0;
		}
	}

	public static TreeMap<Integer, Integer> prime(int num) {
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();


		for (int i = 2; i <= num; i++) {

			if (num % i == 0) {
				if(map.containsKey(i)){
					map.put(i, map.get(i)+1);
				}else{
					map.put(i, 1);
				}
				num /= i;

				i = 1;

			}
		}
		return map;
	}

}