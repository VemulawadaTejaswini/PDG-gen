import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int a[]=new int[N];
		for(int i=0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		int cost[]=new int[201];
		for(int i=0;i<201;i++)
			cost[i]=0;
		for(int i=0;i<201;i++) {
			for(int j=0;j<N;j++) {
				cost[i]+=Math.pow(a[j]-(i-100), 2);
			}
		}
		int min=cost[0]; 
		for(int i=0;i<201;i++) {
			if(min>cost[i])
				min=cost[i];
		}
		System.out.println(min);
	}
}
