import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        int[] a = new int[n];
        List<Integer> orig = new LinkedList<>();
        List<Integer> d = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        for (int i=0; i < n; i++) {
            a[i] = sc.nextInt();
            orig.add(a[i]);
            d.add(a[i]);
            l.add(a[i]);
        }
        l.sort(Comparator.comparingInt(o -> o));

        int m = l.get(l.size()-1);
        int addable;
        int subtractable;

        addable = (n-1) / 2;
        subtractable = (n-1) - addable;

        for (int i=0; i < n-1; i++) {
            if (i < subtractable) {
                m -= l.get(i);
            } else {
                m += l.get(i);
            }
        }

        System.out.println(m);

        // print solution
        List<Map.Entry<Integer, Integer>> procedure = new ArrayList<>();
        boolean add = n % 2 != 0; // y is addable num
        for (int i=0; i < n-1; i++) {
            int x = add ? getIndexOf(a, l.get((i+1)/2)) : getIndexOf(a, l.get(subtractable+(i+1)/2));
            int y = add ? getIndexOf(a, l.get(subtractable+i/2)) : getIndexOf(a, l.get(i/2));
            procedure.add(new AbstractMap.SimpleEntry<>(x, y));
            add = !add;
        }

        for (Map.Entry<Integer, Integer> p : procedure) {
            int x = p.getKey();
            int y = p.getValue();
            // System.out.println("x: " + x + ", y: " + y);

            System.out.println(d.get(x) + " " + d.get(y));
            d.set(x, d.get(x) - d.get(y));
        }
    }

    private static int getIndexOf(int[] a, int target) {
        for (int i=0; i < a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
