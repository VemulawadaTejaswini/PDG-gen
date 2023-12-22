import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
	/*static double res=0;
	 static void help(int p,int r,int n){
		double tmp=p;
		for(int i=1;i<=n;i++){
			double x=1+(double)r/1200 ;
			tmp*=x;
		}
		res+=tmp;
		int k=100000,m=360;
		for(int i=m;i>0;i--){
			help(k,5,i);
		}
		System.out.println("paid amount "+k*m+" ");
		System.out.println((long)res);
	}
*/
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long l1=s.nextLong(),l2=s.nextLong();
        long l=Math.min(l1,l2);
        int x=(int)Math.sqrt(l);
        int y=(int)Math.sqrt(x);
        boolean[] b=new boolean[x+1];
        Arrays.fill(b,true);
        for(int i=2;i<=y;i++){
        	if(!b[i]){continue;}
        	for(int j=i*i;j<=x;j+=i){
        		b[j]=false;
        	}
        }
        int res=0;
        for(int i=2;i<=x;i++){
        	if(b[i]&&l1%i==0&&l2%i==0){res++;}
        }
        System.out.println(res+1);
    }
}
		
	

//0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0









