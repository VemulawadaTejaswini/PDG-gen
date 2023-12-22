import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] l = new int[n];
		int count = 0;
		for(int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}
		Arrays.sort(l);
		for(int i = 0; i < n-1; i++) {
			int a = l[i];
			for(int j = i+1; j < n; j++) {
				int b = l[j];
				int c = a+b;
				int sum = Binary(l,c);
				count+=sum-j;
			}
		}
		System.out.println(count);
	}
	private static int Binary (int[] l,int c) {
		int left = 0;
		int right = l.length;
		while(right-left>1) {
			int mid = (right+left)/2;
			if(l[mid] < c) {
				left = mid;
			}
			else {
				right = mid;
			}
		}
		return left;
	}
}