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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int Q = Integer.parseInt(sc.next());
		//long L = Long.parseLong(sc.next());
		//char[] c = sc.next().toCharArray();
		Scanner sc = new Scanner(System.in);
		
		
		char[] S = sc.next().toCharArray();
		int N = S.length;
		if(N<3){
			System.out.println("0");
			return;
		}
		
		long[] count = new long[N];
		
		for(int i=N-1; i>1; i--){
			if(S[i-1] == 'A')count[i-2] = count[i-1];
			if(S[i] == 'C' && S[i-1] == 'B')count[i-2] = count[i] + 1;
		}
		
		long ans = 0;
		for(int i=0; i<N; i++){
			if(S[i] == 'A'){
				ans += count[i];
			}
		}
		
		System.out.println(ans);
		
		

	}
	

	
}

