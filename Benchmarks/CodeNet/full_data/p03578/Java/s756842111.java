import java.util.HashMap;
import java.util.Scanner;
 
class Main {
    void solve() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int d = in.nextInt();
            if(map.containsKey(new Integer(d))) {
                map.put(new Integer(d), map.get(new Integer(d))  +1);
            }else {
                map.put(new Integer(d), 1);
            }
        }
        int m = in.nextInt();
        for(int i = 0; i < m; i++) {
            int t = in.nextInt();
            if(!map.containsKey(new Integer(t))) {
                System.out.println("NO");
                return;
            }
            int count = map.get(new Integer(t));
            if(count == 0) {
                System.out.println("NO");
                return;
            }
            map.put(new Integer(t), count - 1);
        }
        System.out.println("YES");
    }
 
    public static void main(String[] args) {
        new Main().solve();
    }
}