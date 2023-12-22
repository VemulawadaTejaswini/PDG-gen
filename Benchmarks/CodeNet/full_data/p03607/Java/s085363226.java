import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            int num = Integer.parseInt(sc.next());
            map.put(num, map.containsKey(num)?map.get(num)+1: 1);
        }
        int ans = 0;
        for(int i: map.keySet()){
            if(map.get(i)%2==1) ans++;
        }
        System.out.println(ans);
    }
}
