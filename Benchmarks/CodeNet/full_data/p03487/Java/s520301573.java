import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            int a = Integer.parseInt(sc.next());
            if(map.containsKey(a)){
                map.put(a, map.get(a)+1);
            }else{
                map.put(a, 1);
            }
        }
        int ans = 0;
        for(int key: map.keySet()){
            int a = map.get(key);
            ans += key>a?a:(a-key);
        }
        System.out.println(ans);
    }
}
