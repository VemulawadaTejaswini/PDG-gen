import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int[] a=new int[N];
		
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		
		int[][] part=new int[N][a[N-1]+1];
		int[] cost=new int[N];
		
		
		//配列partに格納	
		for(int i=0;i<N;i++){
			for(int j=a[0];j<=a[N-1];j++){
				
				part[i][j]=(int)Math.pow((a[i]-j),2);
			}
		}
		
		//配列costに格納
		for(int k=0;k<N;k++){
			int sum=0;
			for(int l=a[0];l<=a[N-1];l++){
				
				sum+=part[k][l];
			}
			cost[k]=sum;
		}
		
		Arrays.sort(cost);
		
		System.out.println(cost[0]);
		
		sc.close();
	}
}

