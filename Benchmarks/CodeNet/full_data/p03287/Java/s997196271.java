import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] A = new long[N];
        for(int n=0;n<N;n++) A[n]=sc.nextInt();
        long[] S = new long[N];
        S[0] = A[0]%M;
        for(int n=1;n<N;n++) S[n]=(S[n-1]+A[n])%M;
        Map<Long,Long> count = new HashMap<>();
        for(int n=0;n<N;n++){
        	count.put(S[n],count.getOrDefault(S[n], 0L)+1);
        }
        
        long ans = 0;
        for(Long a:count.keySet()){
        	ans += count.get(a) * (count.get(a)-1) / 2;
        }
        
        ans += count.getOrDefault(new Long(0), new Long(0));
        System.out.println(ans);
    }
}