import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] cmp = new int[10];
        String ans = "No";
        cmp[A]++;
        cmp[B]++;
        cmp[C]++;
        for (int i = 0; i < 10; i++) {
            if(cmp[i] == 2) {
                ans = "Yes";
            }
        }

        System.out.println(ans);

    }
}