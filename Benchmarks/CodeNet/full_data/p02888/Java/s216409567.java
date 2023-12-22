import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> L = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < N; i++)
            L.add(sc.nextInt());

        L.sort(Comparator.naturalOrder());

        for (int i = 0; i < L.size() - 2; i++) {
            for (int j = i + 1; j < L.size() - 1; j++) {
                int idxAB = Collections.binarySearch(L, L.get(i) + L.get(j), Comparator.naturalOrder());
                count += (idxAB < 0 ? -idxAB - 2 : idxAB - 1) - j;
            }
        }

        System.out.println(count);
    }


}


