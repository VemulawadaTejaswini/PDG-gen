import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int ans = 0;
        Map<Integer, Integer> l2 = new HashMap<Integer, Integer>();
        for(int i = 0;i < N;i++){
            int a = sc.nextInt();
            if(l2.containsKey(a))   l2.put(a, l2.get(a)+1);
            else    l2.put(a, 1);
        }
        for(Integer key : l2.keySet()){
            int v = l2.get(key);
            if(key <= v)    ans += v-key;
            else    ans += v;
        }
    }
}