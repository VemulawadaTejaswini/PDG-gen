import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum = 0;
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            A.add(a);
            sum += a;
        }

        int num = 0;
        for (int i = 0; i < N; i++) {
            if (sum <= A.get(i)*4*M) {
                num++;
            }
        }

        System.out.println(num >= M ? "Yes" : "No");
    }
}

