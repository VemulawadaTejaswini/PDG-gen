import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

		solve_abc159_d();
	}
  
  	public static void solve_abc159_d(){

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];
		Map<Integer, Integer> am = new HashMap<Integer, Integer>();
		
		for(int i=0;i<N;i++){

			int ai =sc.nextInt();
			A[i] = ai;
			if(am.containsKey(A[i])){
				int value = am.get(ai).intValue();
				am.replace(ai, value + 1);
			}
			else{
				am.put(ai, 1);
			}
		}
		
		
		for(int i=0;i<N;i++){
			
			int ai = A[i];
			long ans = 0;
			
			for(Entry<Integer, Integer> e: am.entrySet()){
				
				int key = e.getKey();
				int value = e.getValue();
				if(key == ai) value -= 1;
				
				if(value <= 1) continue;
				
				ans += value * (value -1) / 2;
			}
			
			System.out.println(ans);
		}
		

		sc.close();

	}
}
  
  