import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, Integer> l = new HashMap<>();
        int ans = 0;
        for(int i = 0;i < N;i++){
            int a = sc.nextInt();
            if(l.containsKey(a))    l.put(a, 0);
            else    l.put(a, 1);
        }
        for(Integer key : l.keySet())   if(l.get(key) == 1)   ans++;
        System.out.println(ans);
    }
}
