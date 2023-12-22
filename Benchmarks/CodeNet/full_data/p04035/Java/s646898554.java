import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int l = sc.nextInt();
        int [] a = new int [n];
        long total = 0; boolean ok = true;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); total += a[i];
            if (i != 0) {
                if (a[i] + a[i-1] >= l) ok = false;
            }
        }
        int ct = 0; ArrayList<Integer> ret = new ArrayList<>(); int lo = 0; int hi = n - 1;
        while (total >= l && ct < n - 1) {
            if (a[lo] < a[hi]) {
                total -= a[lo]; lo++;
                ret.add(lo);
            } else {
                total -= a[hi];
                ret.add(hi); hi--;
            }
            ct++;
        }
        if (ct != n - 1 || !ok) System.out.println("Impossible");
        else {
            System.out.println("Possible");
            for (int i = 0; i < ret.size(); i++) {
                System.out.println(ret.get(i));
            }
        }
    }


}