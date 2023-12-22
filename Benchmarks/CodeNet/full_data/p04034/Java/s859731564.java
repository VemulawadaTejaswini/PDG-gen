

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		LinkedList<Integer> tar = new LinkedList<Integer>();
		tar.add(0);
		for(int i=1;i<=N;i++) {
			tar.add(i, 1);
		}
		LinkedList<Integer> ls = new LinkedList<Integer>();
		ls.add(1);
		for(int i=0;i<M;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int numx = (int) tar.get(x)-1;
			int numy = (int) tar.get(y)+1;
			
			tar.remove(x);
			tar.add(x, numx);
			tar.remove(y);
			tar.add(y, numy);
			
			if(ls.contains(x)&&(!ls.contains(y))) {
				ls.add(y);
			}
			if(numx==0&&ls.contains(x)) {
				Iterator<Integer> iter = ls.iterator();
			    while (iter.hasNext()) {
			        int item = iter.next();
			        if (item==x) {
			            iter.remove();
			        }
			    }
			}
			
//			Iterator<Integer> iter = tar.iterator();
//			int k=0;
//			while (iter.hasNext()) {
//				int item = iter.next();
//				System.out.print("No"+k+" "+item+" ");
//				k++;
//			}
//			System.out.println();
		}
		System.out.println(ls.size());
	}
	
	
}
