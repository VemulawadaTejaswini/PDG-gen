import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        LinkedList<Integer> l = new LinkedList<>();
        for(int i=0; i<n; i++) {
            l.add(a[i]);
        }
        int min = l.pollFirst();
        int max = l.pollLast();
        List<Tuple> operations = new ArrayList<>();
        int m = min;
        while(!l.isEmpty()) {
            Tuple t = new Tuple();
            int next = l.pollLast();
            if(next > 0) {
                t.x = m;
                t.y = next;
                m -= next;
            }
            else {
                t.x = max;
                t.y = next;
                max = max - next;
            }
            operations.add(t);
        }
        Tuple t = new Tuple();
        t.x = max;
        t.y = m;
        operations.add(t);
        m = max - m;
        System.out.println(m);
        for(int i=0; i<operations.size(); i++) {
            Tuple t2 = operations.get(i);
            System.out.print(t2.x);
            System.out.print(" ");
            System.out.println(t2.y);
        }
    }
}
class Tuple {
    int x;
    int y;
}