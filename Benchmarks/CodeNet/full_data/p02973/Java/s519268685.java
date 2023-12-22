import java.util.ArrayList;
import java.util.Scanner;
class Main{


	static char[][] map;

	static long[][] c;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0;i < n;i++){
			a[i] = sc.nextInt();
		}

		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		int ans = 0;
		
		for(int i = 0;i < n;i++){
			if(list.size() == 0){
				ArrayList<Integer> sub = new ArrayList<Integer>();
				sub.add(a[i]);
				list.add(sub);
			}else{
				int vail = -1;
				int candidate = -1;
				int candidatenum = -1;
				
				int left = 0;
				int right = list.size()-1;
//				System.out.println(i + " i ");
				
				int count = 0;
				while(right - left > 0){
//					System.out.println(right + " right ");
					
					int mid = (left + right)/2;
					if(list.get(mid).get(0) >= a[i]){
						left = mid+1;
					}else{
						right = mid;
					}
					count++;
//					if(count >= 4){
//						System.out.println("aa");
//						return;
//					}
				}
//				
//				
//				for(int j = 0;j < list.size();j++){
//					if(list.get(j).get(0) < a[i] &&  candidatenum <list.get(j).get(0) ){ 			//a[i] < a[j} でかつその中から最大の値をpeakをもつstackを見つける
// 						candidate = j;
//						candidatenum = list.get(j).get(0);
//						vail = 0;
//					}
//				}
				
				if( list.get(left).get(0) < a[i]){					//候補がいればそこにa[i]を追加
					list.get(left).set(0,a[i]);
				}else{							//候補がなければ新しくstackを追加
					ArrayList<Integer> sub = new ArrayList<Integer>();
					sub.add(a[i]);
					list.add(sub);
				}
			}
			
		}
			
		System.out.println(list.size());

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



class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return   end- otherpair.end;
	}








}




