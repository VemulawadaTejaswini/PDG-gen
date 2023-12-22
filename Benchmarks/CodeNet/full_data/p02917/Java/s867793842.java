/* package whatever; // don't place package name! */

import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        int[] list = new int[N-1];
        int sum = 0;

        for (int i = 0; i < N-1; i++) {
            list[i] = sc.nextInt();
        }
        sum = list[0] + list [N-2];

        for (int i = 1; i <= N-2; i++) {
            sum += Math.min(list[i-1], list[i]);
        }

        System.out.println(sum);
        sc.close();
    }
}