
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		//input
		Scanner scan = new Scanner(System.in);
		int n = 3*Integer.parseInt(scan.next());
		Integer[] a = new Integer[n];
		
		for(int i = 0; i < n; i ++){
			a[i] = Integer.parseInt(scan.next());
		}
		
		scan.close();

		Arrays.sort(a, Comparator.naturalOrder());
		
		long res = 0;
		
		for(int i = 2; i< n; i += 2 ){
			res += a[i];
		}
		

		//output
		System.out.println(res);
	}
}