import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] t = new int[n];
		int[] d = new int[n];

		ArrayList<Pair> pairs = new ArrayList<Pair>();
		for(int i = 0;i < n;i++){
			t[i] = sc.nextInt();
			d[i] = sc.nextInt();
			Pair pair = new Pair();
			pair.from = t[i];
			pair.end = d[i];
			pairs.add(pair);
		}

		Collections.sort(pairs,Comparator.reverseOrder());

		int[] cc = new int[100001];			

		

		ArrayList<Integer> one = new ArrayList<Integer>();
		ArrayList<Integer> zero = new ArrayList<Integer>();
		
		cc[pairs.get(0).from]++;			//各寿司について出てきているか判定
		pairs.get(0).from = 1;
		one.add(pairs.get(0).end);
		
		for(int i = 1;i < n;i++){
			if(cc[ pairs.get(i).from ] > 0){			//すでに最高値がある時
				pairs.get(i).from = 0;
				zero.add(pairs.get(i).end);
			}else{
				cc[pairs.get(i).from]++;				//新しい寿司の中で最高値
				pairs.get(i).from = 1;
				one.add(pairs.get(i).end);
			}

		}
	int	syuruimax = one.size();

		long ans = 0;
		int syurui = 0;
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		for(int i = 0;i < k;i++){
			ans += pairs.get(i).end;
			if(pairs.get(i).from == 0){			//最大値じゃない時,
				queue.add(pairs.get(i).end);
				zero.remove(0);
			}else{
				syurui++;
				one.remove(0);
			}
		}	
//
//
//		long[] maxans = new long[syuruimax+1];
//		maxans[syurui] = ans;
//
//		while(syurui < syuruimax){
//			ans += one.get(0);
//			one.remove(0);
//			long del =	queue.poll();
//			ans -= del;
//			syurui++;
//			maxans[syurui] = ans;
//		}
//
//		for(int i = 0;i <= syuruimax;i++){
//			ans = Math.max(ans, maxans[i] + i*i);
//		}

		System.out.println(ans);








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

