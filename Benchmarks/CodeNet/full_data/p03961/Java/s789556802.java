import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = Integer.valueOf(scanner.nextLine());
        String[] rem = scanner.nextLine().split(" ");
        int[] remInt = new int[rem.length];
        for (int i = 0; i < rem.length; ++i) remInt[i] = Integer.valueOf(rem[i]);

        HashSet<Integer> remSet = new HashSet<>();
        HashSet<Integer> useSet = new HashSet<>();
        for (int i = 0; i < remInt.length; ++i) {
            if (remInt[i] != 0) {
                remSet.add(remInt[i]);
            }
        }
        for (int i = 1; i <= remInt.length; ++i) {
            if (!remSet.contains(i)) useSet.add(i);
        }
        perm(useSet, new ArrayList<>(), 0, useSet.size());
        for (ArrayList<Integer> l: lists) System.out.println(l);
        int ret = 0;
        for (int i = 0; i < lists.size(); ++i) {
            int[] r = makeInst(remInt, i);
            for (int j: r)
            ret += findPage(r);
        }
        System.out.println(ret);
    }
    public static ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
    public static void perm(HashSet<Integer> useSet,
                                           ArrayList<Integer> current, int c, int n) {
        if (c >= n) lists.add(current);
        for (int i: useSet) {
            current.add(i);
            HashSet<Integer> useSetThis = (HashSet<Integer>) useSet.clone();
            useSetThis.remove(i);
            perm(useSetThis, current, c + 1, n);
            current = new ArrayList<>();
        }
    }
    public static int[] makeInst(int[] orig, int x) {
        int j = 0;
        int[] madeInt = new int[orig.length];
        for (int i = 0; i < orig.length; ++i) {
            if (orig[i] == 0) madeInt[i] = lists.get(x).get(j++);
            else madeInt[i] = orig[i];
        }
        return madeInt;
    }
    public static int fact(int n){
        int fact = 1;
        if (n == 0) return  fact;
        else {
            for (int i = n; i > 0; i--) fact *= i;
            return fact;
        }
    }
    public static int findPage(int[] perm) {
        int r = 0;
        for (int i = 0; i < perm.length; ++i) {
            r += (perm[i] - 1) * fact(perm.length - (i + 1));
        }
        return r;
    }
}
