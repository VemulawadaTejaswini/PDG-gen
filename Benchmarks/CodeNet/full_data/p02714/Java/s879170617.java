import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        int[] rSum = new int[n + 1];
        int[] gSum = new int[n + 1];
        int[] bSum = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            rSum[i] += rSum[i + 1];
            gSum[i] += gSum[i + 1];
            bSum[i] += bSum[i + 1];
            if (arr[i] == 'R') {
                rSum[i]++;
            } else if (arr[i] == 'G') {
                gSum[i]++;
            } else if (arr[i] == 'B') {
                bSum[i]++;
            }
        }
        long total = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (arr[i] == arr[j]) {
                    continue;
                }
                if ((arr[i] == 'R' && arr[j] == 'G') || (arr[i] == 'G' && arr[j] == 'R')) {
                    total += bSum[j + 1];
                    if (j + (j - i) < n && arr[j + (j - i)] == 'B') {
                        total--;
                    }
                } else  if ((arr[i] == 'G' && arr[j] == 'B') || (arr[i] == 'B' && arr[j] == 'G')) {
                    total += rSum[j + 1];
                    if (j + (j - i) < n && arr[j + (j - i)] == 'R') {
                        total--;
                    }
                } else  if ((arr[i] == 'R' && arr[j] == 'B') || (arr[i] == 'B' && arr[j] == 'R')) {
                    total += gSum[j + 1];
                    if (j + (j - i) < n && arr[j + (j - i)] == 'G') {
                        total--;
                    }
                }
            }
        }
        System.out.println(total);
    }
}