import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] A = new int[N];
        int [] B = new int[N-1];
        
        for(int i =0; i<N-1; i++){
            B[i] = sc.nextInt();
        }
        
        int sum =0;
        int i=0;
        while(i<N-1){
            A[i] =B[i];
            A[i+1] = B[i];
            sum = sum + A[i] + A[i+1];
            i = i+2;
        }
        
        if(N>2){
        sum = sum + B[N-2];
        }
        
        System.out.println(sum);
        
   }  	
}