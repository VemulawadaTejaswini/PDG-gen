import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int W[]=new int[n+1];
        int E[]=new int[n+1];
        for(int i=0;i<=n;i++){
            W[i]=0;
            E[i]=0;
        }
        for(int i=0;i<n;i++){
            W[i+1]=W[i];
            if(s.charAt(i)=='W') W[i+1]++;
            E[i+1]=E[i];
            if(s.charAt(i)=='E') E[i+1]++;
        }
        int ans=99999999;
        for(int i=0;i<n;i++){
            int now=W[i]+E[n]-E[i+1];
            if(ans>now) ans=now;
        }
        System.out.println(ans);
    }
}