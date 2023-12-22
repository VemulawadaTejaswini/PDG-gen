import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int zero = 0;
        int l = 0;
        int r = 0;
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) zero++;
            if (arr[i] < 0) {
                l++;
            }
            if (0 < arr[i]) r++;
        }

        long res = Long.MAX_VALUE;

        List<Integer> ll = new ArrayList<>();
        List<Integer> rr = new ArrayList<>();

        for (int i=0; i<n; i++) {
            if (arr[i] < 0) ll.add(arr[i]);
            if (0 < arr[i]) rr.add(arr[i]);
        }

//        System.out.println(ll);
//        System.out.println(rr);

        if (true) {
            for (int i=0; i<=k; i++) {
                if (zero != 0 && i == k) continue;
                int left = i;
                int right = k - i;
                if (zero != 0) {
                    right = k - i - 1;
                }
                if (l < i) continue;
                if (r < right) continue;
                long tmp = 0;
                if (i == 0) {
                    if (right >= 1) tmp = Math.abs(rr.get(right - 1));
                    res = Math.min(res, tmp);
                    continue;
                }
                tmp = Math.abs(ll.get(ll.size() - i)) + ((1 <= right) ? Math.min(Math.abs(ll.get(ll.size()-i)), rr.get(right-1))+rr.get(right-1) : 0 );
                res = Math.min(res, tmp);
            }
            System.out.println(res);
        }





    }
}
