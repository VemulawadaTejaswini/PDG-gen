import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int K = scan.nextInt();
			
			int[]x = new int[N];
			Deque<Integer>que = new ArrayDeque<Integer>();
			
			
			
			ArrayList<Integer>pra = new ArrayList<Integer>();//+
			ArrayList<Integer>mai = new ArrayList<Integer>();//-
			
			for(int i = 0;i<N;i++) {
				x[i] = scan.nextInt();
				if(x[i]>=0)pra.add(x[i]);
				else mai.add(x[i]);
			}
			
			Collections.sort(mai, Collections.reverseOrder());
			
			if(pra.size()==0) {
				System.out.println(Math.abs(mai.get(K-1)));
				return;
			}else if(mai.size()==0) {
				System.out.println(pra.get(K-1));
				return;
			}
			
			
			int p = 0;
			int m = 0;
			
			while(true) {
				
				int M = Math.abs(mai.get(m));
				
				if(pra.get(p)<=M) {
					p++;
				}else {
					m++;
				}
				
				if(p+m+2==K)break;
			}
			
			
			
			System.out.println(2*Math.abs(mai.get(m))+pra.get(p));
			
			
			
			
		}
		
		
	}
		

}
