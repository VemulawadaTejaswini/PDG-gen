
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] ary = new String[n];
		for(int i = 0; i < n; i++){
			ary[i] = sc.next();
		}
		Arrays.sort(ary);
		int[] streakAry = new int[n];
		int maxNum = 0;
		int sameNum = 0;
		String before = ary[0];
		streakAry[0] = 0;
		for(int i = 1; i < n; i++){
			if(before.equals(ary[i])){
				sameNum++;
				maxNum = Math.max(maxNum, sameNum);
			}else{
				sameNum = 0;
			}
			before = ary[i];
			streakAry[i] = sameNum;
		}
		for(int i = 0; i < n; i++){
			if(streakAry[i] == maxNum){
				System.out.println(ary[i]);
			}
		}
	}
}
