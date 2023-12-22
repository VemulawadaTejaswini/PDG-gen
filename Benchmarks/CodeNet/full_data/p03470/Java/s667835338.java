import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 1;
		Integer[] d = new Integer[n];


		for(int i=0; i<n; i++){
			d[i] = sc.nextInt();
		}

		Arrays.sort(d, Comparator.reverseOrder());

		for(int i=1; i<n; i++){
			if(d[i-1]>d[i]){
				ans++;
			}
		}
		System.out.println(ans);
	}
}