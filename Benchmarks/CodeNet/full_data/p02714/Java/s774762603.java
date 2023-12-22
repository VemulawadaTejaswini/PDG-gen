import java.util.Collection;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Scanner;
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

        UnkoTreeSet<Integer> setR = new UnkoTreeSet<>();
        UnkoTreeSet<Integer> setG = new UnkoTreeSet<>();
        UnkoTreeSet<Integer> setB = new UnkoTreeSet<>();

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

    private static int rgb(UnkoTreeSet<Integer> setA, UnkoTreeSet<Integer> setB, UnkoTreeSet<Integer> setC) {
        int ans = 0;
        for (Integer I : setA) {
            for (Integer J : setB.tailSet(I, false)) {
                int IJ = J - I;
                NavigableSet<Integer> Kkouho = setC.tailSet(J, false);
                ans += setC.tailSize(J);
                if (Kkouho.contains(Integer.valueOf(J + IJ))) {
                    ans--;
                }
            }

        }
        return ans;
    }
}

class UnkoTreeSet<E> extends TreeSet<E> {

    private NavigableMap<E, NavigableSet<E>> tailSetMap = new TreeMap<>();
    private NavigableMap<E, Integer> sizeMemo = new TreeMap<>();

    public UnkoTreeSet() {
        super();
    }

    public UnkoTreeSet(Collection<? extends E> c) {
        super(c);
    }

    @Override
    public NavigableSet<E> tailSet(E e, boolean exclusive) {
        if (!tailSetMap.containsKey(e)) {
            tailSetMap.put(e, super.tailSet(e, exclusive));
        }
        return tailSetMap.get(e);

    }
    
    public Integer tailSize(E e) {
        if(!sizeMemo.containsKey(e)) {
            sizeMemo.put(e, tailSet(e).size());
        }
        
        return sizeMemo.get(e);
    }
}