import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] time = new int[n];
		for(int i=0; i<n; i++){
			time[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] prob = new int[m];
		int[] x = new int[m];
		for(int i=0; i<m; i++){
			prob[i] = sc.nextInt();
			x[i] = sc.nextInt();
		}
		int[] sum = new int[m];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if(j==prob[i]-1)sum[i] += x[i];
				else sum[i] += time[j];
			}
		System.out.println(sum[i]);
		}
	}
}