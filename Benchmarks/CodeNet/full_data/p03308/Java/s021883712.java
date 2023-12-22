
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            a.add(sc.nextInt());
        }

        Collections.sort(a);

        System.out.println(a.get(N - 1) - a.get(0));

    }
}


