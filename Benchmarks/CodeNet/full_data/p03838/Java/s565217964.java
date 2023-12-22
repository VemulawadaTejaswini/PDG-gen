import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int cnt = 0;
        if (x < y) {
            if (y < 0) {  // x:-2, y:-1
                cnt = y - x;
            } else if (x < 0) {
                if (Math.abs(y) < Math.abs(x)) {  // x:-4 y:2
                    cnt = Math.abs(x) - Math.abs(y);
                    cnt += 1;
                } else {  // x:-2, y:4
                    cnt = 1;
                    cnt += y - Math.abs(x);
                }
            } else { // x:1, y:2
                cnt = y - x;
            }
        } else { //  x >= y
            if (x < 0) {  // x:-3, y:-5
                cnt = 1;
                cnt += Math.abs(y) - Math.abs(x);
                cnt += 1;
            } else if (y < 0) {
                if (Math.abs(y) < Math.abs(x)) {   // x:3, y:-2
                    cnt = 1;
                    cnt += x + y;
                } else {  // x:3, y:-5
                    cnt += Math.abs(y) - x;
                    cnt += 1;
                }
            } else {  // x:5, y:3
                cnt = 1;
                cnt += x - y;
                cnt += 1;
            }
        }
        out.println(cnt);
    }
}