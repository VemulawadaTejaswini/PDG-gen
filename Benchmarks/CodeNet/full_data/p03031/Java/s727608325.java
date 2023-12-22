import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> p = new ArrayList<>();
        for(int i=0; i<m; i++) {
            int k = sc.nextInt();
            List<Integer> s = new ArrayList<>();
            for(int j=0; j<k; j++) {
                s.add(sc.nextInt() -1);
            }
            list.add(s);
        }
        for(int i=0; i<m; i++) {
            p.add(sc.nextInt());
        }
        int ans = 0;
        for(int bit=0; bit<Math.pow(2, n);bit++) {
            boolean ok = true;
            for(int i=0; i<m; i++) {
                int count = 0;
                for(int sw : list.get(i)) {
                    if(((bit >> sw) & 1) == 1) {
                        count++;
                    }
                }
                if(count % 2 != p.get(i)) {
                    ok = false;
                    break;
                }
            }
            if(ok) ans++;
        }
        System.out.println(ans);
    }
}