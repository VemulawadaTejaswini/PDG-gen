import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private void execute() throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] b = sc.nextLine().split(" ");
        int[] a = new int[n];
        a[0] = Integer.parseInt(b[0]);
        for (int idx = 0; idx < (n - 1); idx++) {
            int bValue = Integer.parseInt(b[idx]);
            a[idx + 1] = bValue;
            if (bValue < a[idx]) {
                a[idx] = bValue;
            }
        }
        int maxTotal = 0;
        for (int i : a) {
            maxTotal += i;
        }
        System.out.println(maxTotal);
    }

    public static void main(String[] args) {
        try {
            new Main().execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
