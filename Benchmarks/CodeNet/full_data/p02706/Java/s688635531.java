import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		long sum=0;
		for(int i=0; i<m; i++){
			sum+=sc.nextInt();
		}
		if(sum>n){
			System.out.println(-1);
		}else{
			System.out.println(n-sum);
		}
	}
}
