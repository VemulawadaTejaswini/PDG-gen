import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long ans=0;
		long k=0;
		for(int i=0; i<n; i++){
			int a=sc.nextInt();
			if(i==0){
				if(a!=0){
					System.out.println(-1);
					return;
				}
				continue;
			}
			if(k<a){
				ans+=a-k;
			}else{
				ans++;
			}
			k=a+1;
		}
		System.out.println(ans);
	}
}
