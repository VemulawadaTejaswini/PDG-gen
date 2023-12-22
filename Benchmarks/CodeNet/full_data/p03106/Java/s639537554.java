//import java.util.List;
import java.util.Scanner;
//import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		
		int times = 0;
		int small = Math.min(A, B);
//		int big = A > B ? A : B;
		int output = 1;
		for(int i = 1; i <= small; i++) {
			if(A%i == 0 && B%i == 0) {
				times++;
				output = i;
				if(times == K) {					
					break;
				}
			}
		}
		System.out.println(output);
		
	}
	
//	static List<String> getPaths(List<Character> path, int curLen, int totalLen, List<String> paths) {
//		if(curLen == totalLen) return paths;
//		 
//		for(int i = 0; i < path.length; i++) {
//			
//		}
//	}

}
