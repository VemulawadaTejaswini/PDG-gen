import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        long[] A = new long[N];
        long[] S = new long[N+1];
        long[] T = new long[N+1];
        long sum = 0;
        S[0] = 0;
        T[0] = 0;
        Map<Long,Long> map = new HashMap<>();
        map.put(T[0],0L);
        int i=0;
        Long tmp;
        while (i<N) {
            A[i] = Integer.parseInt(sc.next());
            S[i+1] = S[i] + A[i];
            T[i+1] = ((S[i+1] - i-1)%K+K)%K;
            if(i+1<K){
                if((tmp=map.get(T[i+1]))!=null){
                    map.put(T[i+1],tmp+1);
                }else{
                    map.put(T[i+1],0L);
                }
            }
            i++;
        }
        sum+= map.get(T[0]);
        for(i=1;i<N;i++){
            tmp = map.get(T[i-1]);

            if(tmp==0){
                map.put(T[i-1],null);
            }else{
                map.put(T[i-1],tmp-1);
            }
            if(i+K-1<=N){
                if((tmp=map.get(T[i+K-1]))!=null){
                    map.put(T[i+K-1],tmp+1);
                }else{
                    map.put(T[i+K-1],0L);
                }
            }
            sum+=map.get(T[i]);
        }
        System.out.println(sum);
      System.out.flush();
    }
}