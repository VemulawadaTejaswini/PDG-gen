import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Main{
	static final long MOD = 1000000007;

	static int H, W, K;
	static long[][] dp = new long[110][10];
	static int ans = 0;
	static long n = 0;





	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		Map<Integer, Integer> map = new TreeMap<Integer,Integer>();
		int[] city = new int[n+1];			//県ごとの順番を記録
		int[] P = new int[m];
		int[] Y = new int[m]; 
		for(int i = 0;i < m;i++){
			int p = sc.nextInt();
			int y = sc.nextInt();
			P[i] = p;
			Y[i] = y;
			map.put(y, p);
		}
		for(Integer key : map.keySet()){
			int cc = map.get(key);				//県
//			System.out.println(cc);
//			System.out.println(map.get(key));

			map.put(key, city[cc]+1);
			city[cc]++;				//県での順番を+1
		}

		for(int i = 0;i < m;i++){
			System.out.println(String.format("%06d",  P[i]) + String.format("%06d",   map.get(Y[i])));
		}
	}
}







class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

