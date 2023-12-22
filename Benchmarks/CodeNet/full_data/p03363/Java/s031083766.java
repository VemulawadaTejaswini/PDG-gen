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
        int[]B=new int[N+1];
        B[0]=0;
        for(int i=1;i<N+1;i++){
            B[i]=B[i-1]+A[i-1];
        }
        Arrays.sort(B);
        int sum=0;
        for(int i=0;i<N;i++){
            if(B[i]==B[i+1]){
                sum++;
            }
        }
        System.out.println(sum);
   


        

        
}
        
        
    }
