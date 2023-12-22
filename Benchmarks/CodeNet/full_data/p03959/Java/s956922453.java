import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			
			final int N = sc.nextInt();
			
			long[] left_height  = new long[N];
			long[] right_height = new long[N];
			for(int i = 0; i < N; i++){
				final long T = sc.nextLong();
				left_height[i] = T;
			}
			for(int i = 0; i < N; i++){
				final long A = sc.nextLong();
				right_height[i] = A;
			}
			
			boolean[] left_changed = new boolean[N];
			left_changed[0] = true;
			for(int i = 1; i < N; i++){
				if(left_height[i] != left_height[i - 1]){
					left_changed[i] = true;
				}
			}
			
			boolean[] right_changed = new boolean[N];
			right_changed[N - 1] = true;
			for(int i = N - 2; i >= 0; i--){
				if(right_height[i + 1] != right_height[i]){
					right_changed[i] = true;
				}
			}
			
			if(left_height[N - 1] != right_height[0]){
				System.out.println(0);
				return;
			}
			
			long answer = 1;
			for(int i = 0; i < N; i++){
				if(left_changed[i] || right_changed[i]){ continue; }
				//System.out.println(i);
				answer *= (Math.min(left_height[i], right_height[i]));
				answer %= (1000000000 + 7);
			}
			
			System.out.println(answer);
		}
	}
}