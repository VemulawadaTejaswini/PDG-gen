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

        long[] power = new long[]{   524288, 262144, 131072, 65536, 32768, 16384,
                                     8192, 4096, 2048, 1024, 512, 256, 128,
                                     64, 32, 16, 8, 4, 2
                                 };

        long ans = 0;

        for(long p:power){
            System.err.println(p+" "+ball);
            for(Long b:ball.keySet()){
                int r = (p!=b*2) ? Math.min(ball.get(b), ball.get(p-b)) : ball.get(b)/2;
                ball.remove(b,r);
                ball.remove(new Long(p-b), r);
                if(r!=0) System.err.printf("%6d %6d %10d\n", b,p-b,r);
                ans += r;
            }
        }
        System.out.println(ans);
    }
}