import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int counter=0;
		final int N=sc.nextInt();
		final int K=sc.nextInt();
		int[] h=new int[N];
		for(int i=0;i<N;i++){
			h[i]=sc.nextInt();
		}
		for(int i:h){
			if(i>=K){
				counter++;
			}
		}
	}
}