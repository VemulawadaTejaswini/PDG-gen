import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		int N = sn.nextInt();
		int a[] = new int[102];
		double sum = 0;
		double min = 0;
		int cost = 0;
		for(int i = 0;i < N; ++i){			
			a[i] = sn.nextInt();
			sum += a[i];
		}
		min = Math.round(sum/N);
		for(int i = 0;i < N; ++i) cost += (a[i] - min)*(a[i] - min);
		System.out.println(cost);
	}
}
