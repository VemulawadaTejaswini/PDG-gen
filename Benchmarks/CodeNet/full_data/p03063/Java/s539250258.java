import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		
		System.out.println(minNumOfRecolored(N, s));
	}
	
	private static int minNumOfRecolored(int n, String s) {
		char[] arr = s.toCharArray();
		int lastPosOfDot = n;
		for(int i = 0; i < n; i++){
			if(arr[i] == '.') lastPosOfDot = i;
		}
		
		int numOfSharpBeforeLastDot = 0;
		for(int i = 0; i < lastPosOfDot; i++){
			if (arr[i] == '#') numOfSharpBeforeLastDot++;
		}
		
		if(lastPosOfDot == n || numOfSharpBeforeLastDot == 0) return 0;
		
		return Math.min(lastPosOfDot + 1 - numOfSharpBeforeLastDot, numOfSharpBeforeLastDot);
	}
}