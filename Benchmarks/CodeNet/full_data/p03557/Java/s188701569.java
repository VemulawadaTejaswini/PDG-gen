import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        List<Integer> C = new ArrayList<>();

        for (int i = 0; i < N; i++)
            A.add(sc.nextInt());
        Collections.sort(A);

        for (int i = 0; i < N; i++)
            B.add(sc.nextInt());
        Collections.sort(B);

        for (int i = 0; i < N; i++)
            C.add(sc.nextInt());
        Collections.sort(C);

        int ans = 0;
        for (int c : C) {
            for (int b : B) {
                if (b < c) {
                    int tmp = binary(A, b);
                   ans += tmp;
                } else break;
            }
        }

        System.out.println(ans);
    }

    public static int binary(List<Integer> A, int c) {
        int x = Collections.binarySearch(A, c);
        if (x < 0) x = -x - 1;
        else {
            while(A.get(x) == A.get(x - 1))
                x--;
        }
        return x;
    }

}
