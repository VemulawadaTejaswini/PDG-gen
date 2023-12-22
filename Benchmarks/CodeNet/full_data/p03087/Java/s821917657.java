import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        char[] s = sc.next().toCharArray();

        boolean[] isAC = new boolean[n];
        for (int i = 1; i < n; i++) {
            if (s[i-1] == 'A' && s[i] == 'C') {
                isAC[i] = true;
                i++;
            }
        }

        int[] ans = new int[q];
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            for (int j = l; j < r; j++) {
                if (isAC[j])
                    ans[i]++;
            }
        }

        for (int i : ans)
            System.out.println(i);
    }
}
