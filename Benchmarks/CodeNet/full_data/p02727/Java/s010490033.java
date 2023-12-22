import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = sc.nextLong();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        PriorityQueue<Ringo> pq = new PriorityQueue<>(Comparator.comparingLong(o->-o.value));
        for(int i=0;i<A;i++){
            pq.add(new Ringo(0, sc.nextLong()));
        }
        for(int i=0;i<B;i++){
            pq.add(new Ringo(1, sc.nextLong()));
        }
        for(int i=0;i<C;i++){
            pq.add(new Ringo(2, sc.nextLong()));
        }
        long cnter = X+Y;
        long sum=0;
        while(cnter > 0){
            Ringo nxt = pq.poll();
            if(nxt.rg == 0 && X>0){
                X--;
                cnter--;
                sum += nxt.value;
            }else if(nxt.rg == 1 && Y>0){
                Y--;
                cnter--;
                sum += nxt.value;
            }else if(nxt.rg == 2){
                sum += nxt.value;
                cnter--;
            }
        }
        System.out.println(sum);

    }

    private static class Ringo{
        int rg;
        long value;
        Ringo(int rg, long value){
            this.rg = rg;
            this.value = value;
        }
    }
}
