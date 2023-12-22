import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int []a = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		int min = 1000000;
		for(int i = a[0] ; i <= a[n-1] ;i++) {
			int temp = 0;
			for(int j = 0 ; j < n ; j++) {
				temp +=(int)Math.pow(Math.abs(i - a[j]), 2);
			}
			//System.out.println(temp);
			
			min = Math.min(min, temp);
		}
		System.out.println(min);
	}

}
