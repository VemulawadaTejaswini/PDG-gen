import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int arry[]=new int[N+1];
		for(int i=1;i<=N;i++){
			arry[i]=sc.nextInt();
		}
		for(int i=1;i<=N-1;i++){
			for(int k=i+1;k<=N;k++){
				sum=sum+arry[i]*arry[k];
			}
		}
		System.out.println(sum);
    }
}