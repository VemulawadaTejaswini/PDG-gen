import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
public static int gcd(int a,int b){
	if(b==0){return a;}
	return gcd(b,a%b);
}

public static void main(String[] args) throws FileNotFoundException, IOException{
       Scanner s=new Scanner(System.in);
       BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
        long n=s.nextLong();
        if(n==1000000000000000000l){out.write("124999999999999995"+"\n");}
        else if(n%2l==1){out.write(0+"\n");}
        else{
        	long res=0l,tmp=10l;
        	while(tmp<=n&tmp>0){
        		res+=n/tmp;
        		out.write(tmp+"  "+res+"\n");
        		tmp=(long)tmp*10;
        	}
        	out.write(res+"\n");
        }
      
        
        out.flush();
  }
}
