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

		ArrayList<Stack> list = new ArrayList<Stack>();
		int ans = 0;
		
		for(int i = 0;i < n;i++){
			if(list.size() == 0){
				Stack stack = new Stack();
				stack.push(a[i]);
				list.add(stack);
			}else{
				int vail = -1;
				int candidate = -1;
				int candidatenum = -1;
				
				for(int j = 0;j < list.size();j++){
					if(list.get(j).peak() < a[i] &&  candidatenum < list.get(j).peak() ){ 			//a[i] < a[j} でかつその中から最大の値をpeakをもつstackを見つける
 						candidate = j;
						candidatenum = list.get(j).peak();
						vail = 0;
					}
				}
				if(vail == 0){					//候補がいればそこにa[i]を追加
					list.get(candidate).push(a[i]);
				}else{							//候補がなければ新しくstackを追加
					Stack stack = new Stack();
					stack.push(a[i]);
					list.add(stack);
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




