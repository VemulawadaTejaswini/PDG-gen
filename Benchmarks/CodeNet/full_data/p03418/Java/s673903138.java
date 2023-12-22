import java.util.Scanner;

public class Main {   
    public static void main(String[] args) { 
    	int N, K, sum = 0;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); K = sc.nextInt();
        
       for (int i=1; i<=N; i++)
    	   for (int j=K; j<=N; j++)
    		   if (i%j>=K)
    			   sum++;  
       
       System.out.println(sum);    
       sc.close();        
    }
}