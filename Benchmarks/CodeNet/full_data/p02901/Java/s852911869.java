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
	static class test{
		int c;
		Set<Integer> s;
		test(int x,Set<Integer> s1){
			c=x; s=s1;
		}
	}
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt(),m=s.nextInt();
        Set<test> set=new HashSet<>();
         int[] dp1=new int[n+1]; 
         Arrays.fill(dp1,1000000);dp1[0]=0;
        for(int i=0;i<m;i++){
        	int a=s.nextInt(),b=s.nextInt();
        	Set<Integer> s1=new HashSet<>();
        	for(int j=0;j<b;j++){
        		s1.add(s.nextInt());
        	}
        	test t=new test(a,s1);
        	set.add(t);
        }
        Set<Integer>s2=new HashSet<>();
       for(int i=1;i<=n;i++){
       	  if(s2.contains(i)){
       	  	dp1[i]=dp1[i-1];
       	  }
       	  else{
       	  	test tmp=new test(0,new HashSet<>());
       	  	for(test tt:set){
       	  		if(tt.s.contains(i)&&dp1[i]>tt.c){
       	  			dp1[i]=tt.c;
       	  			tmp=tt;
       	  		}
       	  	}
       	  	dp1[i]+=dp1[i-1];
       	  	s2.addAll(tmp.s);
       	  }
       }
       boolean b=true;
       for(int i=1;i<=n;i++){if(!s2.contains(i)){b=false;}}

       if(!b){System.out.println(-1);}
   else{System.out.println(dp1[n]);}
    }
}
		
	

//0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0









