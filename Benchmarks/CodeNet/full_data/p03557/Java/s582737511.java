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
        for (int b : B) {
            int left = 0, right = 0;
            for (int i = 0; i < N; i++) {
                if (A.get(i) < b) left++;
                else break;
            }

            for (int i = N - 1; i >= 0; i--) {
                if (C.get(i) > b) right++;
                else break;
            }

            ans += left * right;
        }

        System.out.println(ans);
    }




}
