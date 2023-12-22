import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        Set<Integer> sortAry = new HashSet<>();
        int[] ary = new int[N];
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(sc.next());
            ary[i] = a;
            sortAry.add(a);
        }
        for (int i = 0; i < N; i++) {
            Set<Integer> copyAry = new HashSet<>(sortAry);
            if (copyAry.size() != 1) {
                copyAry.remove(ary[i]);
            }
            System.out.println(Collections.max(copyAry));
        }
    }
}