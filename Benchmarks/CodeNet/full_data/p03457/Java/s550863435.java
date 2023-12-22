import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int num = new Integer(in.nextLine());
        int x = 0, y = 0, time = 0;
        for (; num > 0; num--) {
            String[] s = in.nextLine().split(" ");
            int diffTime = new Integer(s[0]) - time;
            int xx = new Integer(s[1]);
            int yy = new Integer(s[2]);
            int diffXY = Math.abs(xx - x) + Math.abs(yy - y);
            if (diffTime < diffXY || (diffTime - diffXY) % 2 != 0) {
                System.out.println("No");
                return;
            }
            time = new Integer(s[0]);
            x = xx;
            y = yy;
        }
        System.out.println("Yes");
    }
}