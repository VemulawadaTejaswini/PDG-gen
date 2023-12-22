import java.util.*;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] A = new long[N];
        long[] sum = new long[N];
        HashMap<Long, Integer> map = new HashMap<>();

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            if(i==0){
                sum[i] = A[i];
            }
            else{
                sum[i] = sum[i - 1] + A[i];
            }
            if(map.containsKey(sum[i]%M)){
                map.put(sum[i]%M, map.get(sum[i]%M) + 1);
            }
            else{
                map.put(sum[i]%M, 1);
            }
        }
        long ans = 0;
        for(long key : map.keySet()){
            if(key==0){
                ans += map.get(key);
            }
            ans += (map.get(key) * (map.get(key) - 1)) / 2;
        }
        System.out.println(ans);
               
    }
}