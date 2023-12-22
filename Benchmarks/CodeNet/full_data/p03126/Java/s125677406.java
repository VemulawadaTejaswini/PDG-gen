import java.util.HashMap;
import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] k = new int[n];
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0;i < n;i++){
			k[i] = sc.nextInt();
			for(int j = 0;j < k[i];j++){
				int num = sc.nextInt();
				int sum = map.getOrDefault(num, 0);
				map.put(num,sum + 1);
			}
		}
		int ans = 0;
		for(int num:map.values()){
			if(num == n){
				ans++;
			}
		}
		System.out.println(ans);
		
	}
}

