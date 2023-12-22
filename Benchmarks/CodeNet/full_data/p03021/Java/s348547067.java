import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
 
 
public class Main {

	public static List<List<Integer>> dim;
	public static boolean[] check;
	public static int[] count;
	public static int sum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int Q = Integer.parseInt(sc.next());
		//long L = Long.parseLong(sc.next());
		//char[] c = sc.next().toCharArray();
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.next());
		char[] S = sc.next().toCharArray();
		
		dim = new ArrayList<>();
		for(int i=0; i<N; i++){
			List<Integer> dot = new ArrayList<>();
			dim.add(dot);
		}
		for(int i=0; i<N-1; i++){
			int e_1 = Integer.parseInt(sc.next())-1;
			int e_2 = Integer.parseInt(sc.next())-1;
			dim.get(e_1).add(e_2);
			dim.get(e_2).add(e_1);
 
		}
		
		int min = Integer.MAX_VALUE;
		boolean flag = true;
		boolean checked = false;
		b:for(int i=0;i<N;i++){
			sum = 0;
			check = new boolean[N];
			Arrays.fill(check, false);
			count = new int[N];
	
			walk(i);
			
			if(S[i]=='1' && !checked){
				for(int j=0; j<N; j++){
					if(S[j]=='1'){
						if(count[j]%2 != 0)flag = false;

					}
				}
			}
			for(int j=0; j<N; j++){
				if(S[j]=='1'){
					sum += count[j];

				}
			}
			
			min = Math.min(min, sum);
		}
		
		if(flag){
			System.out.println(min/2);
		}else{
			System.out.println("-1");
		}
		
		
		
		

	}
	
	public static void walk(int from){
		if(check[from]){
			
			return;
		}
		
		check[from] = true;
		
		for(int to : dim.get(from)){
			if(!check[to]){
				count[to] = count[from] + 1;
				
				walk(to);
			}
		}
	}

	
}

