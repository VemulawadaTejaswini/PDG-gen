import java.util.Scanner;
import java.util.TreeMap;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int N = sc.nextInt();
		int M = sc.nextInt();
		TreeMap<Long, Integer> map = new TreeMap<Long,Integer>();
		
		long[] A = new long[N];
		int[] B = new int[N];
		
		for(int i = 0;i < N;i++){
			A[i] = sc.nextLong();
			B[i] = sc.nextInt();
			map.put(A[i], B[i]);
		}
		
		long ans = 0;
		int count = 0;
		for(long num:map.keySet()){
			for(int i = 0;i < map.get(num);i++){
				ans += num;
				count++;
				if(count == M){
					System.out.print(ans);
					return;
				}
			}
		}
		
		
	}
	
	
}

