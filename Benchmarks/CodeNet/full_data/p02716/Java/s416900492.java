import java.util.*;

public class Main {
    static Map<Long, Long> mp = new HashMap<>();
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextLong();
        }
        System.out.println(helper(A, 0, N/2));
    }
    private static long helper(long[] A, int ofs, int cnt){
        long key = ofs * 3_000_00 + cnt;
        if(mp.containsKey(key)){
            return mp.get(key);
        }
        if(cnt == 0){
            return 0;
        }
        int size = (A.length-ofs);
        if(size == 1 && cnt == 1){
            return A[ofs];
        }
        if(size == 2 && cnt == 1){
            return Math.max(A[ofs], A[ofs+1]);
        }
        if(size % 2 == 1 && size/2+1 == cnt){
            long ans = A[ofs] + helper(A, ofs+2, cnt-1);;
            mp.put(key, ans);
            return ans;
        }
        long use = A[ofs] + helper(A, ofs+2, cnt-1);
        long nouse = helper(A, ofs+1, cnt);
        long ans = Math.max(use, nouse);;
        mp.put(key,ans);
        return ans;
    }
}
