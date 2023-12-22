import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		for(int i=0; i<q; i++){
			long a=sc.nextLong();
			long b=sc.nextLong();
			if(a==b){
				System.out.println(2*(a-1));
				continue;
			}
			long r=1000000001;
			long l=1;
			while(r-l>1){
				long m=(r+l)/2;
				long t=a*b;
				if((m+1-(m+1)/2)<Math.min(a,b)){
					t=0;
				}else if((m+1-(m+1)/2)==Math.min(a,b) && m%2==0){
					t=(m+2-(m+1)/2)*((m+1)/2);
				}else if((m+1-(m+1)/2)<Math.max(a,b)){
					t=(m+1-(m+1)/2)*((m+1)/2+1);
				}
				if(a*b<=t){
					r=m;
				}else{
					l=m;
				}
			}
			System.out.println(l);
		}
	}

}
