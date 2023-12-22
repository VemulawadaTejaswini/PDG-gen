import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int max = 0;
        Integer[][] energys = new Integer[n][2];
        for(int i = 0; i < n; i++) {
            energys[i][0] = sc.nextInt();
            energys[i][1] = sc.nextInt();
            max = Math.max(max, energys[i][0]);
        }
        int cnt = 0;
        Arrays.sort(energys, (e1, e2) -> e2[1] - e1[1]);
        for(Integer[] e : energys) {
            if(e[1] > max) {
                cnt++;
                h -= e[1];
            } else break;
            if(h <= 0) break;
        }
        if(h > 0) {
            cnt += (h + max - 1) / max;
        }
        System.out.println(cnt);
    }
}
