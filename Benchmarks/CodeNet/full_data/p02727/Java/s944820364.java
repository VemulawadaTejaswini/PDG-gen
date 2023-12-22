import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int[] rc = new int[a];
        int[] gc = new int[b];
        int[] nc = new int[c];
        PriorityQueue<Integer> rq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> gq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> nq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0; i<a; i++){
            rc[i] = Integer.parseInt(sc.next());
            rq.add(rc[i]);
        }
        for(int i=0; i<b; i++){
            gc[i] = Integer.parseInt(sc.next());
            gq.add(gc[i]);
        }
        for(int i=0; i<c; i++){
            nc[i] = Integer.parseInt(sc.next());
            nq.add(nc[i]);
        }
        nq.add(-1);
        //Arrays.sort(rc, Comparator.reverseOrder());
        //Arrays.sort(gc, Comparator.reverseOrder());
        //Arrays.sort(nc, Comparator.reverseOrder());
        
        long ans = 0;
        for(int i=0; i<x; i++){
            int u = rq.peek();
            int v = nq.peek();
            if(u > v){
                ans += rq.poll();
            }else{
                ans += nq.poll();
            }
        }
        for(int i=0; i<y; i++){
            int u = gq.peek();
            int v = nq.peek();
            if(u > v){
                ans += gq.poll();
            }else{
                ans += nq.poll();
            }
        }
        
        System.out.println(ans);
        
    }
}
