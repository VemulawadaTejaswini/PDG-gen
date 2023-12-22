    import java.util.Scanner;
    
    public class Main{
    public static void main(String args[]){
    	int N=0;
    	int[] A = new int[10001];
    	int sum=0;
    Scanner scan = new Scanner(System.in);
    	N=scan.nextInt();
    	for(int i=0;i<N;i++){
    		A[i] = scan.nextInt();
    	}
    	
    	for(int i=0;i<N;i++){
    		while(A[i]>1){
    			sum++;
    			A[i]=A[i]-2;
    		}
    	}
    	
    	for(int i=0;i<N;i++){
    		if(A[i]>1 && A[i+1]>1){
    			sum++;
    			A[i]--;
    			A[i+1]--;
    		}
    	}
    	
    	
    	System.out.println(sum);
    		
    }
    
}