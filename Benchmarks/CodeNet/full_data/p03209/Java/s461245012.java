import java.util.*;

public class Main {
    static HashMap<String,Long> dic = new HashMap<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        long layer = (long) (4*Math.pow(2,n)-3);
        dic.put(Long.toString(1),1L);
        long ans = helper(layer,x);
        System.out.println(ans);
    }
    // treat every sub-problem as a complete burger. Make-up for the lower buns when necessary
    static public long helper(long layer, long x){
        String k = Long.toString(layer)+"*"+Long.toString(x);
        long ans = 0;
        if(dic.containsKey(k)) return dic.get(k);
        if(x<=0||layer==0) return 0;
        if(layer==1) return 1;
        // in former step, the bun on the top may be annoying so that x>layer.
        // in case this happens, let x <= layer for all the time.
        if(x>layer) x=layer;
        if(2*x+1<layer){
            ans += helper((layer-3)/2,x-1);
        } else{
            ans += helper((layer-3)/2,x-1);
            ans += 1; // the patty in the middle
            if(x==layer) x--;// eating the top bun means nothing
            ans += helper((layer-3)/2,x-(layer+1)/2);
        }
        dic.put(k,ans);
        return ans;
    }
}