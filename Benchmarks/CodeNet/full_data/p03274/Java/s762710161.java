import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int K = scan.nextInt();
			
			int[]x = new int[N];
			
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
				System.exit(0);
			}else if(mai.size()==0) {
				System.out.println(pra.get(K-1));
				System.exit(0);
			}
			
			
			int p = 0;
			int m = 0;
			
			while(true) {
				
				//int M = Math.abs(mai.get(m));
				
				if(pra.size()-1==p) {
					m++;
				}else if(mai.size()-1==m) {
					p++;
				}else if(mai.size()-1==m&&pra.size()-1==p) {
					break;
				}else {
					if(pra.get(p+1)<=Math.abs(mai.get(m+1))) 
						p++;
					else 
						m++;
				}
				/*
				if(pra.get(p)<=M) {
					if(pra.size()-1==p) m++;
					else p++;
				}else {
					if(mai.size()-1==m)p++;
					else m++;
				}*/
				
				if(p+m+2==K)break;
			}
			
			System.out.println(p);
			System.out.println(pra.get(p));
			System.out.println(m);
			System.out.println(mai.get(m));
			
			
			if(Math.abs(mai.get(m))<=pra.get(p)) {
				System.out.println(2*(long)Math.abs(mai.get(m))+(long)pra.get(p));
			}else {
				System.out.println((long)Math.abs(mai.get(m))+2*(long)pra.get(p));
			}
			
			
			
			
			
			
			
			
		}
		
		
	}
		

}
