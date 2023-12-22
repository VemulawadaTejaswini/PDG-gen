import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(n+1<a+b || (long)a*b<n){
			System.out.println(-1);
			return;
		}
		StringBuilder sb=new StringBuilder();
		int start=0;
		int end=n;
		int rem=b;
		while(rem>0){
			start=Math.max(end-a+1,rem);
			for(int i=start; i<=end; i++){
				sb.append(i+" ");
			}
			end=start-1;
			rem--;
		}
		System.out.println(sb);
	}

}
