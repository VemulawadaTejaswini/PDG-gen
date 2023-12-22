import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A[];
        A=new int[N];
        for(int i=0;i<N;i++) A[i]=sc.nextInt();
        Arrays.sort(A);
        double ans=A[0];
        for(int i=1;i<N;i++) ans=(ans+A[i])/2;
        System.out.printf("%.10f\n",ans);
    }
}