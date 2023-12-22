import java.util.*;
import java.io.PrintWriter;
class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt();
        int a[][]=new int[n][60];
        for (int i = 0; i <n ; i++) {
            long num=sc.nextLong();
            for (int j = 0; j <60 ; j++) {
                if((num&(1l<<j))>0){
                    a[i][j]=1;
                }
            }
        }

        long ans=0,mod=1000000007;
        for (int i = 0; i <60 ; i++) {
            int c0=0,c1=0;
            for (int j = 0; j <n ; j++) {
                if(a[j][i]==0)c0++;
                else c1++;
            }
            ans=(ans+(1l*c0*c1*(1l<<i))%mod)%mod;
          //  out.println(i+" "+(c0*c1)+ " "+c0+" "+c1);
        }
        out.println(ans);
        out.close();
    }
}