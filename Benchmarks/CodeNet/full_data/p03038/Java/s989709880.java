
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	
	

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int M=sc.nextInt();
    long A[]=new long[N];
    long B[]=new long[M];
    long C[]=new long[M];
    int maxi = 0;
    long max=0;
    for(int i=0;i<N;i++) {
    	A[i]=sc.nextInt();
    }
    Arrays.sort(A);
    
    long maxtotal=0;
    long maxvalue=0;
    long maxnum=0;

   
    for(int i=0;i<M;i++) {
    	B[i]=sc.nextInt();
    	C[i]=sc.nextInt();
    	Arrays.sort(A);
    	long total=0;
    	long value=C[i];
    	long num=B[i];
    	
    	for(int j=0;j<N;j++) {
        	if(num>0&&A[j]<value) {
        		A[j]=value;
        		num--;
        	}
        	total+=A[j];
        }
    	
    	if(maxtotal<total) {
    		maxtotal=total;
    		maxvalue=C[i];
    		maxnum=B[i];
    		
    	}
    }
    System.out.println(maxtotal);
    
    

	
	
	
    

		
	}
	

	
}
		