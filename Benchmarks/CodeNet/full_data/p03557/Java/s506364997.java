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
            int left = Collections.binarySearch(A, b - 1);
            if (left < 0) {
                left = -left - 1;
            } else {
                while(left < N && A.get(left) == b - 1) left++;
            }

            int right = Collections.binarySearch(C, b + 1);
            if (right < 0) {
                right = -right - 1;
            } else {
                while(right >= 0 && C.get(right) == b + 1) right--;
                if (right < 0) right = 0;
            }

            ans += left * (N - right);

        }

        System.out.println(ans);
    }


}
