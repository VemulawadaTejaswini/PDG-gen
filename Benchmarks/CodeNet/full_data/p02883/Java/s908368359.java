import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        
        PriorityQueue<Long> alist = new PriorityQueue<Long>((a,b)->(int)(b-a));
        for(int i=0;i<N;i++){
            alist.add(sc.nextLong());
        }
        PriorityQueue<Long> flist = new PriorityQueue<Long>((a,b)->(int)(a-b));
        for(int i=0;i<N;i++){
            flist.add(sc.nextLong());
        }
        PriorityQueue<Set> slist = new PriorityQueue<Set>((a,b)->(int)(b.ab-a.ab));
        long sum = 0l;
        while(alist.size()>0){
            Set st = new Set(alist.poll(),flist.poll());
            slist.add(st);
            sum+=st.a;
        }
        if(sum<=K){
            System.out.println(0);
            return;
        }
        
        
        while(K>0){
            Set st1 = slist.poll();
            if(st1.a<K){
                K-=st1.a;
                st1.upd(0);
            }else{
                st1.upd(K-st1.a);
                K=0l;
            }
            if(st1.ab>0) slist.add(st1);
        }
        long ans = 0;
        while(slist.size() > 0){
            ans = (Math.max(ans, slist.poll().ab));
        }
        System.out.println(ans);
    }
    
    static class Set{
        long a,b,ab;
        Set(long a,long b){
            this.a = a;
            this.b = b;
            this.ab = a*b;
        }
        void upd(long a){
            this.a = a;
            this.ab = a*this.b;
        }
        String toStr(){
            return this.a + ", " + this.b + ", " + this.ab;
        }
    }
}
