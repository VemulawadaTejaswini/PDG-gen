import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int notReadyExams = 0;
        int lackingReadinessInNotReadyExams = 0;
        int totalReadiness = 0;
        int readinessRequired = 0;
        List<Integer> excessReadinesses = new ArrayList<>();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++) {
            b[i] = sc.nextInt();
            if (a[i] < b[i]) {
                notReadyExams++;
                lackingReadinessInNotReadyExams += (b[i] - a[i]);
            } else if (a[i] > b[i]) {
                excessReadinesses.add(a[i] - b[i]);
            }
            totalReadiness += a[i];
            readinessRequired += b[i];
        }

        if (totalReadiness < readinessRequired) {
            System.out.println(-1);
            return;
        }
        if (notReadyExams == 0) {
            System.out.println(0);
            return;
        }
        int numChangesReqd = notReadyExams;
        Collections.sort(excessReadinesses, Collections.reverseOrder());
        for (int excessReadiness : excessReadinesses) {
            numChangesReqd++;
            lackingReadinessInNotReadyExams -= excessReadiness;
            if (lackingReadinessInNotReadyExams <= 0) {
                System.out.println(numChangesReqd);
                return;
            }
        }
        System.out.println(-1);
    }
}
