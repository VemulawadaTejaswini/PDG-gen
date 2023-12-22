import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < n; i++)
            num.add(sc.nextInt());
        int cnt = 0;
        r: for (int i = 0; i < n; i++) {
            for (int k = 0; k < num.size(); k++) {
                if (num.get(k) != k + 1) {
                    num.remove(k);
                    cnt++;
                    k--;
                }
                if(k==num.size-1){
                    break r;
                }
                if (cnt == n) {
                    System.out.println(-1);
                    System.exit(0);
                }
            }
        }
        System.out.println(cnt);
    }
}
