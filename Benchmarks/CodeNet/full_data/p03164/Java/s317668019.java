
import java.util.*;

public class Main {
    static int len;
    static int[] warr;
    static int[] varr;
    static Map<Integer,Map<Integer,Long>> map;

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
        boolean exist = true;
        if(map.get(idx) == null){
            exist = false;
            map.put(idx, new HashMap<Integer,Long>());
        }
        else if(map.get(idx).get(val) == null) exist = false;
        if(!exist){
            if(idx == len){
                map.get(idx).put(val, 0l);
            }
            else{
                long skip = dp(idx+1, val);
                if(val >= warr[idx]){
                    skip = Math.max(dp(idx+1,val-warr[idx])+varr[idx], skip);
                }
                map.get(idx).put(val, skip);
            }
        }
        return map.get(idx).get(val);
    }
}