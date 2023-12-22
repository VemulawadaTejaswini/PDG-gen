import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        int count = 0;
        while (0 < a.size()) {
            count++;
            Iterator<Integer> iter = a.iterator();
            int cur = -1;
            while (iter.hasNext()) {
                int next = iter.next();
                if (cur < next) {
                    iter.remove();
                    cur = next;
                }
            }
        }
        System.out.println(count);
    }
}
