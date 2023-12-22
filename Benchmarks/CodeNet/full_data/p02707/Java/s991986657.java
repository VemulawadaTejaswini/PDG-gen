import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<n-1; i++) {
            int tmp = sc.nextInt();
            arr[tmp-1]++;
        }

        for (int i=0; i<n; i++) {
            System.out.println(arr[i]);
        }
    }
}
