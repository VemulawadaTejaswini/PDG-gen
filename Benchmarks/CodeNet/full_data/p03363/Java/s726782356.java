import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;


public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        int[]B=new int[N];
        int[]C=new int[N];
        B[0]=A[0];
        int x=0;
        for(int i=1;i<N;i++){
            B[i]=B[i-1]+A[i];
            if(B[i]==0){
                x++;
            }
        }
        C[0]=B[N-1];
        for(int i=1;i<N;i++){
            C[i]=C[i-1]-A[N-i];
            if(C[i]==0){
                x++;
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N-2-i;j++){
                if(B[N-1]-B[i]-C[j]==0){
                    x++;
                }

            }
        }
        System.out.println(x);
   


        

        
}
        
        
    }
