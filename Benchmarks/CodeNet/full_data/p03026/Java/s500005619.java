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
	public static int[] C ;
	public static int[] ans ;
	public static PriorityQueue<Integer> D;
	public static List<List<Integer>> dim;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		int N = Integer.parseInt(sc.next());
		//int[][] dim = new int[N][3];
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
		C = new int[N];
		D = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0; i<N; i++){
			C[i] = Integer.parseInt(sc.next());
			D.offer(C[i]);
		}
		Arrays.sort(C);
		int sum=0;
		for(int i=0; i<N-1; i++){
			sum+=C[i];
		}
		
		ans = new int[N];
		
		walk(0);
		

		System.out.println(sum);
		for(int a : ans){
			System.out.print(a+" ");
		}
		//int Q = Integer.parseInt(sc.next());
		//long L = Long.parseLong(sc.next());
		//char[] c = sc.next().toCharArray();

	}
	
	public static void walk(int v){
		if(ans[v] != 0)return;
		if(D.size()==0)return;
		ans[v] = D.poll();
		for(int a : dim.get(v)){
			walk(a);
		}
	}
	
}

