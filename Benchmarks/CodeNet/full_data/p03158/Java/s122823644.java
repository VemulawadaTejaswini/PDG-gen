

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static int equalOrGreater(int n, long[] a, long target) {
       int low = 0, high = n; // numElems is the size of the array i.e arr.size()
while (low != high) {
    int mid = (low + high) / 2; // Or a fancy way to avoid int overflow
    if (a[mid] <= target) {
        /* This index, and everything below it, must not be the first element
         * greater than what we're looking for because this element is no greater
         * than the element.
         */
        low = mid + 1;
    }
    else {
        /* This element is at least as large as the element, so anything after it can't
         * be the first element that's at least as large.
         */
        high = mid;
    }
}
return high;
    }
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        long [] a = new long[n];
        long [] x = new long[n];
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextLong();
        }
        Arrays.sort(a);
        Map<Long, Integer> index = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            index.put(a[i], i);
        }

        for (int j = 0; j < q; ++j) {
            x[j] = scanner.nextLong();
        }
        long [] crossT = new long[n];
        crossT[0] = a[0];
        crossT[1] = a[1];
        for (int i = 2; i < n; ++i) {
            crossT[i] = crossT[i - 2] + a[i];
        }

        long [] sumT = new long[n];
        sumT[0] = a[0];
        for (int i = 1; i < n; ++i) {
            sumT[i] = sumT[i - 1] + a[i];
        }
        for (int j = 0; j < q; ++j) {
//            if (index.containsKey(x[j])) {
//                int idx = index.get(x[j]);
//                int start = Math.max(0, 2 * idx - ( n  - 1));
//                int number = n - 1 - start + 1;
//                int startT = start + (number + 1) / 2;
//                long rightSum = 0;
//                if (startT - 1 >= 0) {
//                    rightSum = sumT[n - 1] - sumT[startT - 1];
//                }
//                long leftSum = crossT[start - 1];
//                System.out.println(leftSum + rightSum);
//                return;
//            }
      //      System.out.println("x: " + x[j]);
            int greaterIndex = equalOrGreater(n, a, x[j]);
            boolean noLeft = false;
     //       System.out.println("greatIndex: " + greaterIndex);
                int rightNum = n - 1 - greaterIndex + 1;
       //         System.out.println("rightNum: " + rightNum);

                int start = Math.max(n - 2 * rightNum, 0);
                if (start <= 0) {
                    noLeft = true;
                }
            //    System.out.println("start: " + start);
                int number = n - 1 - start + 1;
             //   System.out.println("number: " + number);
                int startT = (n - 1 + start + 1) / 2;
             //   System.out.println("startT: " + startT);
                long rightSum = 0;
                if (startT - 1 >= 0) {
                    rightSum = sumT[n - 1] - sumT[startT - 1];
                }
                long leftSum = 0;
                if (start - 1 >= 0 && noLeft == false) {
                    leftSum = crossT[start - 1];
                }
           //     System.out.println("rightSum: " + rightSum + " leftSum: " + leftSum);
                System.out.println(leftSum + rightSum);


        }
    }
}
