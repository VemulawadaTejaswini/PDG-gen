import java.io.*;
import java.util.*;
import static java.lang.System.in;

public class Main {
    long mod = 1000000000+7;
    public static void main(String[] args) throws Exception {
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    long solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        Integer[] a = new Integer[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>( Collections.reverseOrder());
        queue.addAll(Arrays.asList(a));
        // greedy. simulate one by one
        for(int i=0;i<m;i++){
            if(queue.size()==0) break;
            int big = queue.poll();
            big /= 2;
            if(big>0) queue.add(big);
        }
        long ans = 0;
        while(queue.size()>0){
            ans += queue.poll();
        }
        return ans;
    }
}

