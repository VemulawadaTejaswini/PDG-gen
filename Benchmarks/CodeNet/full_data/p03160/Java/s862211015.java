import java.nio.Buffer;
import java.util.*;
import java.io.*;

public class Main {
    static int [] map=new int[10001];
    static int [] ans=new int[10001];
    static int max2=987654321;
    static int dp(int N){
        if(N<=1) return 0;
        if(ans[N]!=max2) return ans[N];
        ans[N]=Math.min(ans[N],dp(N-1)+Math.abs(map[N-1]-map[N]));
        ans[N]=Math.min(ans[N],dp(N-2)+Math.abs(map[N-2]-map[N]));
        return ans[N];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            map[i]=sc.nextInt();
            ans[i]=max2;
        }
        int k=dp(N);
        System.out.println(k);

    }
}