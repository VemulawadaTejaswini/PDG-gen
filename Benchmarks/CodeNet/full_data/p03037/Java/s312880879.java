import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
 
 
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		
		int left_max = 0;
		int right_min = Integer.MAX_VALUE;
		
		for(int i=0; i<M;i++){
			int L = Integer.parseInt(sc.next());
			int R = Integer.parseInt(sc.next());
			left_max = Math.max(left_max, L);
			right_min = Math.min(right_min,R);
		}
		int ans = right_min - left_max + 1;
		if(ans<0)ans = 0;
		
		System.out.println(ans);
			
		
		
		
		
	}
	
	
	
}