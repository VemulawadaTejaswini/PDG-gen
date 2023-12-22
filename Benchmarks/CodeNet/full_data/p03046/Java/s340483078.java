import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); int k = sc.nextInt();
        if (k >= (1 << m)) {
            System.out.println(-1);
        } else if (m == 0) {
            System.out.println(0 + " " + 0);
        } else if (m == 1) {
            if (k == 0) {
                System.out.println(0 + " " + 0 + " " + 1 + " " + 1);
            } else System.out.println(-1);
        } else {
            ArrayList<Integer> ans = new ArrayList<>();
            for (int i = 0; i < (1 << m); i++) if (i != k) ans.add(i);
            ans.add(k);
            for (int i = (1 << m) - 1; i >= 0; i--) if (i != k) ans.add(i);
            ans.add(k);
            for (int i = 0; i < ans.size(); i++) System.out.print(ans.get(i) + " ");
        }
    }


}