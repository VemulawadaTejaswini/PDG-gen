import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        long c[][] = new long [N+K+3][K+3];
        int mod = 1000000007;
        c[0][0]=1;
        for(int i=0;i<N+K+2;i++) {
            for(int j=0;j<K+2;j++) {
                long tmp =  c[i][j]%mod;
                c[i+1][j]+=tmp;
                c[i+1][j+1]+=tmp;
            }
        }

        int[] num = new int[N];
        long ans = 0;
        long ans_sub = 0;
        for(int i=0;i<N;i++){
            num[i]=scan.nextInt();
        }
        for(int i=0;i<N;i++){
            ans_sub=0;
            for(int l=0;i+l+K-1<N;l++){
                ans_sub+=Math.abs(num[l]-num[i+l+(K-1)]);
            }
            ans+=ans_sub*c[K-2+i][K-2];
        }

        System.out.println(ans%1000000007);
    }
}
