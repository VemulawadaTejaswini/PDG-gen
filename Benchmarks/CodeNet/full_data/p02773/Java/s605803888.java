import java.math.*;
import java.util.*;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int str = sc.nextInt();
            li.add(str);
        }
        Collections.sort(li);
        List<Integer> ansli = new ArrayList<>();
        int cnt = 0;
        int tmp=0;
        int cnt2=0;
        for (int i = 0; i < n; i++) {
            if (li.get(i) != li.get(i + 1))
                tmp++;
            else {
                if (tmp > cnt)
                    cnt = tmp;
                tmp = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            if (li.get(i) != li.get(i + 1))
                tmp++;
            else {
                if (tmp == cnt)
                    ansli.add(li.get(i));
                    cnt2++;
            }
        }
        for (int i = 0; i < cnt2; i++) {
            System.out.println(ansli.get(i));
        }
    }
}
