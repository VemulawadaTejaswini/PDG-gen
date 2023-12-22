import java.util.*;
import java.util.Arrays;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N+1];
        A[0]=0;
        for(int i=1;i<N+1;i++){
            A[i]=sc.nextInt();
        }
        for(int i=1;i<N+1;i++){
            int sum=0;
            if(i!=N){
                int a=A[i];
                A[i]=A[i+1];
                for(int j=1;j<N+1;j++){
                    sum+=Math.abs(A[j]-A[j-1]);
                }
                System.out.println(sum+Math.abs(A[N]));
                A[i]=a;
            }
            if(i==N){
                for(int j=1;j<N;j++){
                    sum+=Math.abs(A[j]-A[j-1]);

                }
                System.out.println(sum+Math.abs(A[N-1]));
            }

        }
        

       
        
    }}