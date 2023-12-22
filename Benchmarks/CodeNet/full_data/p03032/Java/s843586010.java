import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int[] values;
	static int n;
	static int k;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		values = new int[n];
		for(int i = 0; i < n; i++){
			values[i] = sc.nextInt();
		}
		int ans = 0;
		for(int i = 0; i <= k; i++){
			for(int i2 = 0; i2 <= k - i; i2++){
				if(i + i2 > n){
					break;
				}
				for(int i3 = 0; i3 <= k - i - i2; i3++){
					if(i + i2 < i3){
						break;
					}
					int val = operate(i, i2, i3);
					ans = Math.max(ans, val);
				}
			}
		}
		System.out.println(ans);
	}
	
	static int operate(int a, int b, int c){
		ArrayList<Integer> ary = new ArrayList<>();
		for(int i = 0; i < a; i++){
			ary.add(values[i]);
		}
		
		for(int i = 0; i < b; i++){
			ary.add(values[n - i - 1]);
		}
		ary.sort(Integer::compareTo);
		for(int i = 0; i < c; i++){
			int n = ary.get(i);
			if(n < 0){
				ary.set(0, 0);
			}
		}
		int sum = 0;
		for(int n : ary){
			sum += n;
		}
		return sum;
	}
}

