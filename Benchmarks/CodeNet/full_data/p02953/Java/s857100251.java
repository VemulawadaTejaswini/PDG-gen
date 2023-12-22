import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int flag = h[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (flag >= h[i] - 1)
                flag = h[i] - 1;
            else
                break;
        }
        if (flag == h[0] - 1)
            System.out.println("Yes");
        else if (h[n - 1] == flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}