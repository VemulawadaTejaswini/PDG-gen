import java.util.Arrays;
import java.util.Scanner;
class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力


		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] A = new int[n];
		Pair[] pairs = new Pair[m];
	
		for(int i = 0;i < n;i++){
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		
		for(int i = 0;i < m;i++){
			Pair pair = new Pair();
			pair.from = sc.nextInt();
			pair.end = sc.nextInt();
			pairs[i] = pair;
		}
		Arrays.sort(pairs);
//		
//		for(int i = 0;i < m;i++){
//			System.out.println(pairs[i].end);
//		}
//		System.out.println();
		
		int index = 0;
		for(int i = 0;i < m;i++){
			int candidate = pairs[i].end;
			for(int j = 0;j < pairs[i].from;j++){
				if(A[index] < candidate){
					A[index] = candidate;
					index++;
					if(index >= n){
						allsum(A);
						return;
					}
	 			}else{
	 				break;
	 			}
			}	
		}
		
		allsum(A);
		
		
		

		
		
	}
	
	static void allsum(int[] A){
		long ans = 0;
		for(int i = 0;i < A.length;i++){
//			System.out.println(A[i]);
			ans += A[i];
		}
		System.out.print(ans);
	}


	static int gcd(int a,int b){				//最大公約数を返す
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}





}



class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return  otherpair.end - end;
	}
}


