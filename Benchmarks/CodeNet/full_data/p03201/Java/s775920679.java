import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */

class Counter<T> extends HashMap<T,Integer>{
    public Counter(){
        super();
    }
    public Integer get(Object elm){
        return getOrDefault(elm,0);
    }
    public void add(T elm, int amount){
        if(!this.containsKey(elm)) put(elm, amount);
        else replace(elm, get(elm)+amount);
    }
    public void addOne(T elm){
        add(elm, 1);
    }
    public void remove(T elm, int amount){
        replace(elm, Math.max(get(elm)-amount, 0));
    }
    public void removeOne(T elm){
        remove(elm, 1);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Counter<Long> ball = new Counter<>();
        for(int n=0; n<N; n++) ball.addOne(sc.nextLong());

        long[] power = new long[32];
        power[31]=2;
        for(int i=30; i>=0; i--) power[i] = 2 * power[i+1];

        long ans = 0;

        for(long p:power){
            for(Long b:ball.keySet()){
                int r = (p!=b*2) ? Math.min(ball.get(b), ball.get(p-b)) : ball.get(b)/2;
                ball.remove(b,r);
                ball.remove(new Long(p-b), r);
                ans += r;
            }
        }
        System.out.println(ans);
    }
}