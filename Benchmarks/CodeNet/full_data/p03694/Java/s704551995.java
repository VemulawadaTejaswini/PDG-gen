import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = Integer.parseInt(scan.next());
		}
		Arrays.sort(a);
		System.out.println(a[n-1]-a[0]);
	}

}
