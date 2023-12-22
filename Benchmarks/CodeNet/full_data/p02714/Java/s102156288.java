import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

    private static char R = 'R';
    private static char G = 'G';
    private static char B = 'B';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.next();
        String S = sc.next();
        sc.close();

        char[] c = S.toCharArray();

        NavigableSet<Integer> setR = new UnkoTreeSet<>();
        NavigableSet<Integer> setG = new UnkoTreeSet<>();
        NavigableSet<Integer> setB = new UnkoTreeSet<>();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == R) {
                setR.add(Integer.valueOf(i + 1));
            } else if (c[i] == G) {
                setG.add(Integer.valueOf(i + 1));
            } else {
                setB.add(Integer.valueOf(i + 1));
            }
        }

        int ans = 0;
        ans += rgb(setR, setG, setB);
        ans += rgb(setR, setB, setG);
        ans += rgb(setG, setR, setB);
        ans += rgb(setG, setB, setR);
        ans += rgb(setB, setR, setG);
        ans += rgb(setB, setG, setR);
        System.out.println(ans);
    }

    private static int rgb(NavigableSet<Integer> setA, NavigableSet<Integer> setB, NavigableSet<Integer> setC) {
        int ans = 0;
        for (Integer I : setA) {
            for (Integer J : setB.tailSet(I)) {
                int IJ = J - I;
                for (Integer K : setC.tailSet(J)) {
                    if (K - J == IJ) {
                        continue;
                    }
                    ans++;
                }
            }

        }
        return ans;
    }
}

class UnkoTreeSet<E> extends TreeSet<E> {

    private NavigableMap<E, SortedSet<E>> tailSetMap = new TreeMap<>();

    public UnkoTreeSet() {
        super();
    }

    @Override
    public SortedSet<E> tailSet(E e) {
        if (!tailSetMap.containsKey(e)) {
            tailSetMap.put(e, super.tailSet(e));
        }
        return tailSetMap.get(e);

    }
}
