import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main{
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			Integer []x = new Integer[N];
			Integer []X = new Integer[N];
			Set<Integer> set = new TreeSet<Integer>();
			for(int i = 0;i<N;i++) {
				x[i] = scan.nextInt();
				X[i] = x[i];
				set.add(x[i]);
			}
			
			Arrays.sort(x,Collections.reverseOrder());//降順にソート
			
			for(int i = 0;i<N;i++) {
				//System.out.print(x[i]);
				//System.out.print(" ");
				//System.out.println(X[i]);
			}
			
			int num = (N-1+1)/2;
			
			for(int i = 0;i<N;i++) {
				if(X[i]<x[num-1])
					System.out.println(x[num-1]);
				else
					System.out.println(x[num-1+1]);
			}
			
			
		}
		
		
	}
		

}
