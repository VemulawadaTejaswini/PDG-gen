import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count = 0;
        int[] ans = new int[n - 1];
        String x;
        String y;
        for (int i = 1; i < n; i++) {

            x = s.substring(0, i);

            y = s.substring(i);

            for (int j = 0; j < x.length(); j++) {
                if (y.contains(String.valueOf(x.charAt(j)))) {
                    if (j == 0) {

                        count++;
                    } else if (!(x.substring(0, j).contains(String.valueOf(x.charAt(j))))) {
                        count++;

                    }

                }
            }

            ans[i - 1] = count;
            count = 0;
        }
        Arrays.sort(ans);
        System.out.println(ans[n - 2]);
    }
}