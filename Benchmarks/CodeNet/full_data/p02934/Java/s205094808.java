import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A[];
        A=new int[N];
        for(int i=0;i<N;i++) A[i]=sc.nextInt();
        double ans=0;
        for(int i=0;i<N;i++) ans+=(double)1/A[i];
        ans=1/ans;
        System.out.printf("%.10f\n",ans);
    }
}