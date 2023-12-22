import java.util.Scanner;

/**
 * Created by zzt on 17-2-4.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int ai,indexOfMin = 0,minOfA = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            ai = scanner.nextInt();
            if (minOfA>ai) {
                indexOfMin = i;
                minOfA = ai;
            }
            a[i] = ai;
        }
        int curMinIndexOfA = indexOfMin;
        int tempIndex;
        boolean flag = true;
        while (true) {
            int numOfLEZ = 0;
            for (int j = 0; j < n; j++) {
                tempIndex = (indexOfMin + j)%n;
                a[tempIndex] -= (j + 1);
                if (minOfA>a[tempIndex]) {
                    minOfA = a[tempIndex];
                    curMinIndexOfA = tempIndex;
                }
                if (a[tempIndex]==0) {
                    numOfLEZ++;
                }
                if (a[tempIndex]<0) {
                    numOfLEZ++;
                    flag = false;
                }
            }
            indexOfMin = curMinIndexOfA;
            if (numOfLEZ>=n)
                break;
        }
        System.out.println(flag?"YES":"NO");
    }
}