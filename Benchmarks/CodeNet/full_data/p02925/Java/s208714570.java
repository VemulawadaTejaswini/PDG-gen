import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;
class Main{


	static final int MOD = 1000000007;


	static ArrayList<ArrayList<Pair>> map;
	static TreeMap<Integer,Integer> ans; 
	static int maxnum;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力

		int n = sc.nextInt();

		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		int[][] data = new int[n][n-1];
		int[] index = new int[n];

		for(int i = 0;i < n;i++){
			list.add(new ArrayList<Integer>());
			for(int j = 0;j < n-1;j++){
				int a = sc.nextInt()-1;
				list.get(i).add(a);
				data[i][j] = a;
			}
		}
		//		for(int i = 0;i < n;i++){
		//			for(int j = 0;j < n-1;j++){
		//				System.out.print(list.get(i).get(j) + " ");
		//			}
		//			System.out.println();		
		//		}

		int count = 0;
		int ans = 1;

		Queue<Pair> queue = new LinkedList<Pair>();
		HashSet<Integer> used = new HashSet<Integer>();

		for(int i = 0;i < n;i++){
			int rival = list.get(i).get(0);
			if(list.get(rival).get(0) == i && i < rival && !used.contains(i) && !used.contains(rival)){
				Pair pair = new Pair(i, rival);
				queue.add(pair);
				used.add(i);
				used.add(rival);
				count++;
			}
		}

		Queue<Pair> nextque = new LinkedList<Pair>();

		while(true){
			nextque = new LinkedList<Pair>();

			used = new HashSet<Integer>();
			boolean vail = false;

			for(Pair pair:queue){
				
				int first = pair.from;
				int second = pair.end;
				
				list.get(first).remove(0);
				list.get(second).remove(0);
				
				
//				System.out.println(first + " " + second);
				if(list.get(first).size() != 0){
					int candidatefirst = list.get(first).get(0);
					if(list.get(candidatefirst).size()!= 0 && list.get(candidatefirst).get(0) == first){
						Pair next = new Pair(first, candidatefirst);
						nextque.add(next);
//						System.out.println("追加 "+first + " " + candidatefirst);
						
						vail = true;
						count++;
					}
				}
				if(list.get(second).size() != 0){
					int candidatesecond = list.get(second).get(0);
					if(list.get(candidatesecond).size()!= 0 && list.get(candidatesecond).get(0) == second){
						Pair next = new Pair(second, candidatesecond);
						nextque.add(next);
//						System.out.println("追加 "+second + " " + candidatesecond);

						vail = true;
						count++;
					}
				}



			}

//			System.out.println();

			ans++;

			if(!vail){
				System.out.println(-1);
				return;
			}
			if(count >= n*(n-1)/2){
				break;
			}
			queue = nextque;			//更新

		}
		
		
		
		System.out.println(ans);




	}





	static int upperbond(int k,int min,int[] data){		//kより小さい最大の値をdataの中から探し、返す二分探索
		int max = data.length;
		//		if(min == data.length-1){
		//			if(data[min] > k){
		//				return min;
		//			}
		//		}

		while(max-min > 1){
			int mid = (max+min)/2;
			if(data[mid] >= k){
				max = mid;
			}else{
				min = mid;
			}
		}

		return max;
	}

	static int lowerbond(int k,int min,int[] data){		//kより大きい最小の値をdataの中から探し、返す二分探索
		int max = data.length;

		while(max-min > 1){
			int mid = (max+min)/2;
			if(data[mid] >= k){
				max = mid;
			}else{
				min = mid;
			}
		}
		return min;
	}



	static int gcd(int a,int b){				//最大公約数を返す
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}
	static long gcd(long a,long b){
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}



	static long lcm (long a, long b) {
		long g = gcd(a,b);
		return a/g*b;
	}




}

class Town{
	int index;
	int x ;
	int y;
	public Town(int index,int x,int y) {
		this.index = index;
		this.x = x;
		this.y = y;
		// TODO 自動生成されたコンストラクター・スタブ
	}


}


class Edge  implements Comparable{

	int index;
	HashSet<Integer> hen;
	HashSet<Integer> used;
	HashMap<Integer, Integer> map;
	int size;


	public Edge(int index) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.index = index;
		hen = new HashSet();
		used = new HashSet<Integer>();
		map = new HashMap<Integer,Integer>();
	}

	public int compareTo(Object other) {
		Edge otherpair = (Edge)other;

		return   otherpair.hen.size() - hen.size();
	}
}

class Food implements Comparable{

	int minits;
	int score;
	double cospa;

	public Food(int from,int end,double c) {
		this.minits = from;
		this.score = end;
		this.cospa = c;
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public int compareTo(Object other) {
		Food otherpair = (Food)other;
		int dif = Double.compare(otherpair.cospa, cospa);
		return   dif;
	}

}

class Pair implements Comparable{
	int from;
	int end;
	public Pair(int from,int end) {
		this.from = from;
		this.end = end;
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return  from - otherpair.from;
	}








}




