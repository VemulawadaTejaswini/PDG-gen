import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> s = new HashMap<>();
        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            if(s.containsKey(str)) {
                s.put(str, s.get(str)+1);
            } else {
                s.put(str, 1);
            }
        }

        int m = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> t = new HashMap<>();
        for(int i=0; i<m; i++) {
            String str = sc.nextLine();
            if(t.containsKey(str)) {
                t.put(str, t.get(str)+1);
            } else {
                t.put(str, 1);
            }
        }
        sc.close();

        int tmpAns = 0;
        int ans = 0;
        for(String str: s.keySet()) {
            if(!t.containsKey(str)) {
                tmpAns = s.get(str);
            } else {
                tmpAns = s.get(str) - t.get(str);
            }
            if(ans < tmpAns) {
                ans = tmpAns;
            }
        }
        System.out.println(ans);
    }
}
