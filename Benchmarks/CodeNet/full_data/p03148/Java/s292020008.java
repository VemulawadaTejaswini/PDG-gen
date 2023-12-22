import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] f=new long[n+1];
        Point[] sushi = new Point[n];
        HashSet<Integer> all = new HashSet<>();
        for (int i = 0; i < n; i++) {
            sushi[i]=(new Point(sc.nextInt(), sc.nextInt()));
            all.add(sushi[i].x);
        }
        Arrays.sort(sushi,(p1, p2) -> p2.y - p1.y);
        HashSet<Integer> num = new HashSet<>();
        int[] s = new int[n + 1];
        long temp=0;
        for (int i = 0; i < k; i++) {
            temp += (long)sushi[i].y;
            s[sushi[i].x]++;
            num.add(sushi[i].x);
        }
        f[num.size()]=temp;
        int l = k - 1, r = k;
        long ans = temp + (long)num.size() * (long)num.size();
        while (l > 0 && r < n) {
            while (l > 0&&s[sushi[l].x] == 1) {
                l--;
            }
            if (l>0) {
                while (r < n&&s[sushi[r].x] > 0) {
                    r++;
                }
                if (r < n) {
                    s[sushi[r].x]++;
                    s[sushi[l].x]--;
                    num.add(sushi[r].x);
                    f[num.size()] = f[num.size() - 1] - (long)sushi[l].y + (long)sushi[r].y;
                }
            }
        }
        for (long i = 0; i <= all.size(); i++) {
            ans=max(ans,f[(int)i]+i*i);
        }
        out.println(ans);
    }
}
