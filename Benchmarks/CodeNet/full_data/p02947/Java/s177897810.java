import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(int i=0; i<N; i++){
            char[] a = sc.next().toCharArray();
            Arrays.sort(a);
            String s = new String(a);
            if(map.containsKey(s)){
                map.put(s, map.get(s) + 1);
            }
            else{
                map.put(s, 1);
            }
        }

        long ans = 0;
        for(int i:map.values()){
            ans += (long)i * (i - 1) / 2;
        }
        System.out.println(ans);
    }
}