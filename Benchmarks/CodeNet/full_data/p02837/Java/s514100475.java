import java.util.*;

public class Main{

    static long gcd(long a,long b){
        if(b==0)return a;
        return gcd(b,a%b);
    }

    static long lcm(long a,long b){
        return a/gcd(a,b)*b;
    }
    public static void main(String[] srgs){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[][][] in=new int[n][][];
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            in[i]=new int[m][2];
            for(int j=0;j<m;j++){
                in[i][j][0]=sc.nextInt();
                in[i][j][1]=sc.nextInt();
            }
        }
        int out=0,N=1<<n;
        for(int i=0;i<N;i++){
            int c=0,t=1;
            for(int j=0;j<n;j++)if((i>>j&1)==1){
                c++;
                for(int k=0;k<in[j].length;k++){
                    if((i>>(in[j][k][0]-1)&1)+in[j][k][1]==1)
                        t=0;
                }
            }
            if(t==1)out=Math.max(out,c);
        }
        System.out.println(out);
    }
}
