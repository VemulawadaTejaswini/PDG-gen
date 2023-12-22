import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<String, Integer> blues = new HashMap<String, Integer>();
        for(int i = 0; i < N; i++){
            String s = sc.next();
            if(blues.containsKey(s)){
                int a = blues.get(s);
                blues.replace(s, a+1);
            }else{
                blues.put(s, 1);
            }
        }
        int M = sc.nextInt();
        Map<String, Integer> reds = new HashMap<String, Integer>();
        for(int i = 0; i < M; i++){
            String t = sc.next();
            if(reds.containsKey(t)){
                int b = reds.get(t);
                reds.replace(t, b+1);
            }else{
                reds.put(t, 1);
            }
        }
        int ans = 0;
        for(String s: blues.keySet()){
            ans = Math.max(ans, blues.get(s) - reds.getOrDefault(s, 0));
        }
        System.out.println(ans);
        sc.close();
    }
}
