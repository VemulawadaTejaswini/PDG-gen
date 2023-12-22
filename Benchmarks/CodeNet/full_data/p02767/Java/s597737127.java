
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int []x = new int [n];
		
		for(int i= 0 ;i < n ;i++) {
			x[i] = Integer.parseInt(sc.next());
		}
		
		Arrays.sort(x);
		int min = n* x[n-1] * x[n-1];
		for(int i = x[0] ; i <= x[n-1] ;i++) {
			int temp = 0;
			for(int j = 0 ; j < n ; j++) {
				temp += Math.pow(i-x[j], 2);
			}
			min = Math.min(temp, min);
		}
		
		System.out.println(min);

	}

}
