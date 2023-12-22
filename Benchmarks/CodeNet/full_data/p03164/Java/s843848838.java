
import java.util.*;

public class Main{
    static int len;
    static int[] warr;
    static int[] varr;
    static Map<String,Long> map;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] temp = in.nextLine().trim().split("\\s");
        int n = Integer.parseInt(temp[0]);
        len = n;
        int w = Integer.parseInt(temp[1]);
        warr = new int[n];
        varr = new int[n];
        for(int i = 0; i < n; i++){
            temp = in.nextLine().trim().split("\\s");
            warr[i] = Integer.parseInt(temp[0]);
            varr[i] = Integer.parseInt(temp[1]);
        }
        map = new HashMap<>();
        System.out.println(dp(0,w));
    }

    public static long dp(int idx, int val){
        String tp = "" + idx + "," + val;
        if(map.getOrDefault(tp, null) == null){
            if(idx == len){
                map.put(tp,0l);
            }
            else{
                long skip = dp(idx+1, val);
                if(val >= warr[idx]){
                    skip = Math.max(dp(idx+1,val-warr[idx])+varr[idx], skip);
                }
                map.put(tp,skip);
            }
        }
        return map.get(tp);
    }
}