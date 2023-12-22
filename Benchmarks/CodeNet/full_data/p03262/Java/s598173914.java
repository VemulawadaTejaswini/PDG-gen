import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] coor = new int[n];
        for (int i = 0; i < n; i++) {
            coor[i] = sc.nextInt();
        }
        if (n == 1)
            System.out.println(Math.abs(coor[0] - x));
        Arrays.sort(coor);
        int minStep = Math.min(coor[n - 1] - coor[0], Math.abs(x - coor[0]));
        for (int i = 1; i < n; i++) {
            if (coor[i] - coor[i - 1] < minStep)
                minStep = coor[i] - coor[i - 1];
            if (Math.abs(x - coor[i]) < minStep)
                minStep = Math.abs(x - coor[i]);
        }
        while (minStep > 1) {
            boolean isValid = true;
            for (int i : coor) {
                if (Math.abs(i - x) % minStep != 0) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                System.out.println(minStep);
                return;
            }
            minStep--;
        }
        System.out.println(1);
    }
}