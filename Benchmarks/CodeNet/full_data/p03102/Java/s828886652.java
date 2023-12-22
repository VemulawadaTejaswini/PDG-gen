import java.util.*;
public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int N=sc.nextInt();	    
	    int M=sc.nextInt();	    
	    int C=sc.nextInt();
	    
	    int[] B=new int[M];
	    int[][] A=new int[N][M];
	    
	    int sum;
	    int ans=0;
	    for(int i=0;i<M;i++) {
	    	B[i]=sc.nextInt();
	    }
	    
	    for(int i=0;i<N;i++) {
	    	for(int j=0;j<M;j++) {
		    	A[i][j]=sc.nextInt();
		    }
	    }
	    
	    for(int i=0;i<N;i++) {
	    	sum=0;
	    	for(int j=0;j<M;j++) {
		    	sum+=A[i][j]*B[j];
		    }
	    	sum+=C;
	    	if(sum>0) {
	    		ans++;
	    	}
	    }
	    
	    System.out.println(ans);
	    

	}

}