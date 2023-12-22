import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		boolean reverse=false;
		LinkedList<Integer> b = new LinkedList<Integer>();
		for (int i=0; i<n; i++) {
			if( reverse) {
				b.addFirst(a[i]);
			}else{
				b.addLast(a[i]);
			}
			reverse = ! reverse;
		}
		
		for(int i=0; i<b.size(); i++) {
			int index = reverse ? b.size()-i-1 : i ;
			if (i>0) System.out.print(" ");
			System.out.print(b.get(index));
		}
		
	}

}
