import java.util.*;
import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int A[];
        A=new int[M];
        for(int i=0;i<M;i++) A[i]=sc.nextInt();
        int sum=0;
        for(int i=0;i<M;i++) sum+=A[i];
        System.out.println(Math.max(-1,N-sum));
    }
}