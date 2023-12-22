import java.util.*;

public class Main{
//public class abc163_c{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];

		for(int i=0; i<(n-1); i++ ){
			int x = scan.nextInt();
			a[x] += 1; 
		}

		for(int i=0; i<n; i++ ){
			if(i!=0)System.out.println(a[i]);
		}
      	System.out.println(0);

	}
}