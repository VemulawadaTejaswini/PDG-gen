import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Map<Integer, Integer> s = new HashMap<>();
        int max = -1;
        for(int i = 0; i < n; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            max = Math.max(max, a);
            s.put(a, b);
        }
        System.out.println(s.get(max) + max);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
