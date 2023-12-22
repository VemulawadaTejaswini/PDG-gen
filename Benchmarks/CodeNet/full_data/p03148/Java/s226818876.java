//この貪欲だと寿司の個数の更新が1つずつなので例2のようなケース（1つずつ更新しても増えない（単調に増加しない））ではじかれる
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Point[] sushi = new Point[n];
        for (int i = 0; i < n; i++) {
            sushi[i]=(new Point(sc.nextInt(), sc.nextInt()));
        }
        Arrays.sort(sushi,(p1, p2) -> p2.y - p1.y);
        //arrout(sushi);
        HashSet<Integer> num = new HashSet<>();
        long f = 0;
        int[] s = new int[n + 1];
        for (int i = 0; i < k; i++) {
            f += sushi[i].y;
            s[sushi[i].x]++;
            num.add(sushi[i].x);
        }
        int tn = num.size();
        int l = k - 1, r = k;
        long ans = f + num.size() * num.size();
        //out.println("ansshoki="+ans+"f="+f);
        int llll=0;
        while (l > 0 && r < n) {
            int tl=l,tr=r;
            /*
            out.println("kosuu="+num.size());
            out.println("はじめ　r="+r+" l="+l);
            */
            while (s[sushi[l].x] == 1 && l > 0) {
                l--;
//                out.println(1);
            }
            if (l>0) {
//                out.println(2);

                while (s[sushi[r].x] > 0 && r < n) {
                    r++;
//                    out.println(3);

                }
                if (r < n) {
                    /*
                    out.println(4);
                    out.println("sahen="+(f + num.size() * num.size()));
                    out.println("uhen="+(f - sushi[l].y + sushi[r].y + (num.size() + 1) * (num.size() + 1)));
                    */
                    if (f + num.size() * num.size() < f - sushi[l].y + sushi[r].y + (num.size() + 1) * (num.size() + 1)) {
                        //out.println(5);

                        s[sushi[r].x]++;
                        s[sushi[l].x]--;
                        num.add(sushi[r].x);
                        ans = f - sushi[l].y + sushi[r].y + (num.size() + 1) * (num.size() + 1);
                        f = f - sushi[l].y + sushi[r].y;
                    }
                }
            }
            //out.println("ato r="+r+" l="+l);
            if(tl==l&&tr==r)break;
        }
        out.println(ans);
    }
    static void arrout(Object[] p){
        for (int i = 0; i < p.length; i++) {
            out.println(p[i]);
        }
    }
}