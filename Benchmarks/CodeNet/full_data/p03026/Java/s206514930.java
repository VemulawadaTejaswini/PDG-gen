import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
 
 
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		int N = Integer.parseInt(sc.next());
		int[][] dim = new int[N][3];
		for(int i=0; i<N-1; i++){
			int e_1 = Integer.parseInt(sc.next())-1;
			int e_2 = Integer.parseInt(sc.next())-1;
			dim[e_1][0] = e_1;
			dim[e_2][0] = e_2;
			dim[e_1][1]++;
			dim[e_2][1]++;
		}
		Arrays.sort(dim,(a,b) -> Integer.compare(b[1], a[1]));
		
		int[] C = new int[N];
		for(int i=0; i<N; i++){
			C[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(C);
		int sum=0;
		for(int i=0; i<N; i++){
			dim[i][2] = C[N-1-i];
			if(i!=N-1)sum+=C[i];
		}
		
		Arrays.sort(dim,(a,b)->Integer.compare(a[0], b[0]));
		System.out.println(sum);
		for(int i=0; i<N; i++){
			System.out.print(dim[i][2]+" ");
		}
		//int Q = Integer.parseInt(sc.next());
		//long L = Long.parseLong(sc.next());
		//char[] c = sc.next().toCharArray();
			
		
		
		
		
	}
	
}

