import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        int[] max = new int[2];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] >= max[1]) {
                max[0] = i;
                max[1] = a[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (i == max[0]) {
                int result = 0;
                for (int j = 0; j < n; j++) {
                    if (a[j] >= result && max[0] != j) {
                        result = a[j];
                    }
                }
                System.out.println(result);
            } else {
                System.out.println(max[1]);
            }
        }
    }
}
