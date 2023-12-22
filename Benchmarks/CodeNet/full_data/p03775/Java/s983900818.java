import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		long N=s.nextLong();
		int F=0;
	    long A[]=new long[10000];
	    long B[]=new long[10000];
	    String a,b;
	    int i=0;
	    long x=0;
	    int count=0;
	    int min=0;
	    
	    for(i=1;i<(int)(N/2);i++){
	    	x=(long)(N/i);
	    	if((float)N/i==x){
	    	A[count]=i;
	    	B[count]=N/i;
	    	count++;
	    	}
	    }
	    for(i=(int)(N/2);i<=N;i++){
	    	x=(long)(N/i);
	    	if((float)N/i==x){
	    	A[count]=i;
	    	B[count]=N/i;
	    	count++;
	    	}
	    }
	    
	    a=String.valueOf(A[0]);
    	b=String.valueOf(B[0]);
    	if(a.length()<=b.length())F=b.length();
    	if(a.length()>b.length())F=a.length();
    	min=F;
   
	    for(i=0;i<count;i++){
	    	a=String.valueOf(A[i]);
	    	b=String.valueOf(B[i]);
	    	if(a.length()<=b.length())F=b.length();
	    	if(a.length()>b.length())F=a.length();
	    	if(min>F)min=F;
	    }
	    System.out.print(min);
	
	    

	}

}