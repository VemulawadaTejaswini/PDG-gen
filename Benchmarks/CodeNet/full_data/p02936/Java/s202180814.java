import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] parentList = new int[n];
        int[] cntList = new int[n];

        for (int i = 0; i < n; i++) {
            parentList[i] = -1;
        }

        for (int i = 0; i < n-1; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;

            parentList[b] = a;
        }

        for (int i = 0; i < q; i++) {
            int p = sc.nextInt()-1;
            int x = sc.nextInt();

            cntList[p] += x;
        }

        for (int i = 0; i < n; i++) {
            if (parentList[i] != -1)
                cntList[i] += cntList[parentList[i]];

            System.out.print(cntList[i] + " ");
        }
    }
}