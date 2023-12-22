import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Long[] bestSushi = new Long[N];
        Arrays.fill(bestSushi, 0L);
        List<Long> otherSushi = new ArrayList<>(N);

        int sushiKind = 0;

        for(int n=0; n<N; n++){
            int t=sc.nextInt()-1;
            long d = sc.nextLong();
            if(bestSushi[t]==0) sushiKind++;
            if(bestSushi[t]>=d) otherSushi.add(d);
            else{

                otherSushi.add(new Long(bestSushi[t]));
                bestSushi[t] = d;
            }
        }
        Arrays.sort(bestSushi, Comparator.reverseOrder());
        Collections.sort(otherSushi, Comparator.reverseOrder());

        long[] bestSum = new long[K+1];
        bestSum[0] = 0L;
        for(int k=1; k<=K; k++){
            bestSum[k] = bestSum[k-1]+bestSushi[k-1];
        }
        long[] otherSum = new long[K+1];
        otherSum[0] = 0L;
        for(int k=1; k<=K; k++){
            otherSum[k] = otherSum[k-1]+otherSushi.get(k-1);
        }

//        System.err.println(Arrays.toString(bestSushi));
//        System.err.println(Arrays.toString(bestSum));
//
//        System.err.println(otherSushi);
//        System.err.println(Arrays.toString(otherSum));

        long ans = 0;
        for(int kind=1; kind<=Math.min(K,sushiKind); kind++){
            int other = K-kind;
            ans = Math.max(ans, bestSum[kind]+otherSum[other]+((long)kind)*kind );
            //System.err.printf("%d %d\n", kind, ans);
        }

        System.out.println(ans);



    }
}
