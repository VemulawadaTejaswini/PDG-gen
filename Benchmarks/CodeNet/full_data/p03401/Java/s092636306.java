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
        int[]B=new int[N+2];
        B[0]=A[0];
        B[N+1]=0-A[N];
        for(int i=1;i<N+1;i++){
            B[i]=A[i]-A[i-1];
        }
        int sum=0;
        for(int i=0;i<N+2;i++){
            sum+=Math.abs(B[i]);
        }
        for(int i=2;i<N+2;i++){
            if(((B[i-1]>=0)&&(B[i]>=0))||((B[i-1]<=0)&&B[i]<=0)){
                System.out.println(sum);
            }
            else if((B[i-1]>0)&&(B[i]<0)){
                System.out.println(sum-Math.abs(B[i])-Math.abs(B[i-1]));
            }else{
                int x=Math.abs(B[i])+Math.abs(B[i-1]);
                int y=Math.abs(B[i]+B[i-1]);
                System.out.println(sum-(x-y));
            }


        }
       

       
        
    }}