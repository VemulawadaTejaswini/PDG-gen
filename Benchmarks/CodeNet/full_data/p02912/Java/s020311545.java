import java.util.*;
import java.lang.*;



public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        PriorityQueue<Long> goods = new PriorityQueue<>(Collections.reverseOrder());
        for(int n=0; n<N; n++) goods.add(sc.nextLong());
        for(int m=0; m<M; m++) goods.add(goods.poll()/2);

        long ans = 0;
        while(!goods.isEmpty()) ans += goods.poll();
        System.out.println(ans);
    }
}
