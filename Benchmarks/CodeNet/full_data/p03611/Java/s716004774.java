import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] x=new int[100001];
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int m=sc.nextInt();
			if(m+1<100002&&m-1>-1){
			x[m-1]++;
			x[m+1]++;
			}
			x[m]++;
		}
		int s = 0;
		for(int i=0;i<100001;i++){
			if(x[i]>s){
				s = x[i];
			}
		}
		System.out.print(s);
	}
}