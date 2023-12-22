import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[] alphas = new int[n];
			List<Integer> alphaList = new ArrayList<>();
			
			int max = 0;
			for(int i = 0 ; i < n ; i++ ) {
				alphas[i] = sc.nextInt() / 2; //割った状態でセット
				alphaList.add(alphas[i]);
				if ( alphas[i] > max ) {
					max = alphas[i];
				}
			}
			
			Collections.sort(alphaList);			
			alphaList = alphaList.stream().distinct().collect(Collectors.toList());
			max = alphas[0];
			for(int i = 1 ; i < alphaList.size() ; i++) {
				max = lcm(max, alphaList.get(i));
			}
			
			for(int i = 1 ; i < alphaList.size() ; i++) {
				int k = max / alphaList.get(i);
				if ( k % 2 == 0 ) {
					System.out.println(0);
					return;
				}
			}
			
			int steps = (m / max);
			int count = 0;
//			System.out.println(max);
//			System.out.println(steps);
			
//			
//			//最小公倍数を求めるやり方の方がいいのかも
//			
			for(int i = 0 ; i < steps ; i++ ) {
				
				if ( (i+1) % 2 == 1 ) {
					count++;
				}
//				int num = (i+1) * max;
//				if (num > m) {
//					continue;
//				}
//				
//				boolean match = true;
//				for(int j = 0 ; j < n ; j++ ) {
//					if ( num % alphas[j] == 0 ) {
//						int divided = num / alphas[j];
//						if ( (divided - 1) % 2 == 0 ) {
//							//matched!
//						}
//						else {
//							match = false;
//							break;
//						}
//					}
//					else {
//						match = false;
//						break;
//					}
//				}
//				
//				if ( match ) {
//					count++;
//				}
			}
			
			System.out.println(count);
		}
	}
	
	public static int lcm(int a, int b) {
		if ( a >  b ) {
			return lcm(b, a);
		}
		
		if ( b % a == 0 ) {
			return b;
		}
		
		int gcd = gcd(a, b);
		
		return (a / gcd) * b;
		
	}
	
	public static int gcd(int a, int b) {
		
		if ( a > b ) {
			return gcd(b, a);
		}
		
		if ( a == 0 ) {
			return b;
		}
		else {
			return gcd(a, b-a);
		}
	}
}