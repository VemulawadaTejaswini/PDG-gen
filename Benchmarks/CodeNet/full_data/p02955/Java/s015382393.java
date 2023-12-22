import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] aArray = new int[n];
			
			for(int i = 0 ; i < n ; i++ ) {
				aArray[i] = sc.nextInt();
			}
			
			//ある数の倍数の近傍距離(+,-)の合計値がK以下で整合していたら変換可能と考えられる
			//ただし、+の距離Aは倍数Dのマイナス距離D-Aとなることに注意
			//数の合計がある数の倍数になっているか
			//ただし入力4が10にならないことを考えないといけない
			
			List<Integer> candidates = new ArrayList<>();
			
			int sum = Arrays.stream(aArray).sum();
			
			for(int i = 1 ; i <= Math.ceil(Math.pow(sum,0.5)) ; i++ ) {
				if ( sum % i == 0) {
					candidates.add(i);
					//other
					int j = sum / i;
					if ( i != j ) {
						candidates.add(j);
					}
				}
			}
			
			int max = 0;
			for(int candidate : candidates) {
				
				boolean isOK = true;
				for(int i = 0 ; i < n ; i++ ) {
					int rest = aArray[i] % candidate;
					if ( rest > k && (candidate - rest) > k ) {
						//cannot do this
						isOK = false;
						break;
					}
				}
				
				if ( isOK ) {
					if ( candidate > max) {
						max = candidate;
					}
				}
				
			}
			
			System.out.println(max);
		}
	}
}
