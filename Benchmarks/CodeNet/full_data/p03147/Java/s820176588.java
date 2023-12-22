import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] check = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = 0;

        while (!Arrays.equals(arr, check)) {
            int l = 0;
            int min = Integer.MAX_VALUE;
            while (l < n && arr[l] == 0) {
                l++;
            }
            int cp = l;
            while (l < n && arr[l] != 0) {
                min = Math.min(min, arr[l]);
                l++;
//                System.out.println(min);
            }
            for (int i=cp; i<l; i++) {
                arr[i] -= min;
//                System.out.println(cp);
            }
            res += min;

        }


        System.out.println(res);

    }


}

