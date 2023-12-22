import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i=0; i<m; i++) arr[i] = sc.nextInt();
        if (m == 1) {
            System.out.println(0);
            return;
        }
        Arrays.sort(arr);

        int sum = arr[m-1] - arr[0];

        int[] diff = new int[m-1];
        for (int i=0; i<m-1; i++) {
            diff[i] = arr[i+1]-arr[i];
        }

        Arrays.sort(diff);

        while (1 < n) {
            sum -= diff[m-2];
            n--;
            m--;
        }


        int l = 0;
        int r = arr.length - 1;



        System.out.println(sum);


    }


}

