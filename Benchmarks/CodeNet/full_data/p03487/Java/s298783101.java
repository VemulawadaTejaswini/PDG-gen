import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int compare = a[0];
        int count = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                if (compare == a[i]) {
                    count++;
                    if (compare == count) {
                        break;
                    } else if (compare < count) {
                        ans += 1;
                        break;
                    } else {
                        ans += count;
                    }
                } else {
                    if (a[i] == 1) {
                        break;
                    } else if (compare > count) {
                        ans += count;
                    }
                }
            } else if (compare == a[i]) {
                count++;
                if (compare < count) {
                    ans++;
                }
            } else if (compare < a[i]) {
                if (compare > count) {
                    ans += count;
                }
                compare = a[i];
                count = 1;
            }

        }
        System.out.println(ans);
    }
}