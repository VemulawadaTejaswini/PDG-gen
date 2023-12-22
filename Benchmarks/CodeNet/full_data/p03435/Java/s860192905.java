import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] C1 = new int[3];
        int[] C2 = new int[3];
        int[] C3 = new int[3];
        for (int i = 0; i < 3; ++i) {
            C1[i] = sc.nextInt();
            C2[i] = sc.nextInt();
            C3[i] = sc.nextInt();
        }
        if (sol(C1) != sol(C2) || sol(C2) != sol(C3)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

    private static int sol(int[] C) {
        Arrays.sort(C);
        int sum = 0;
        for (int n : C) {
            sum += n;
        }
        return sum - C[0] * C.length;
    }
}