import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());

        int[][] a = new int[n][n - 1];
        int[] index = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            index[i] = 0;
        }

        int opponent = n - 1;
        int ans = 0;
        int[] matched = new int[n];
        Boolean isComplete = false;
        Boolean canClear;
        int buttleCount = 0;
        while (!isComplete) {
            canClear = false;
            for (int i = 0; i < n; i++) {
                matched[i] = 0;
            }
            for (int i = 0; i < n; i++) {
                if (matched[i] == 0 && index[i] < opponent) {
                    int s = a[i][index[i]] - 1;
                    if (matched[s] == 0 && index[s] < opponent && (a[s][index[s]] - 1) == i) {
                        index[i]++;
                        index[s]++;
                        matched[i]++;
                        matched[s]++;
                        canClear = true;
                    }
                }
            }
            if (canClear) {
                buttleCount++;
                if (isComplete) ans = buttleCount;
            } else {
                isComplete = true;
                for (int i = 0; i < n; i++) {
                    if (index[i] < opponent) ans = -1;
                }
                if (ans != -1) ans = buttleCount;
            }
        }

        System.out.println(ans);
    }
}