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
        int idx = 0;
        int l = 0;
        int r = 0;
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) zero++;
            if (arr[i] < 0) {
                idx++;
                l++;
            }
            if (0 < arr[i]) r++;
        }

        long res = Long.MAX_VALUE;

        if (arr[0] > 0) {
            System.out.println(arr[k-1]);
            return;
        } else if (arr[n-1] < 0) {
            System.out.println(Math.abs(arr[n-k]));
            return;
        }

//        System.out.println(idx - 1);

        List<Integer> ll = new ArrayList<>();
        List<Integer> rr = new ArrayList<>();

        for (int i=0; i<n; i++) {
            if (arr[i] < 0) ll.add(arr[i]);
            if (0 < arr[i]) rr.add(arr[i]);
        }

//        System.out.println(ll);
//        System.out.println(rr);

        if (zero == 0) {
            for (int i=0; i<=k; i++) {
                int left = i;
                int right = k - i;
                if (l < i) continue;
                if (r < right) continue;
                long tmp = 0;
                if (i == 0) {
                    tmp = Math.abs(rr.get(right - 1));
                    res = Math.min(res, tmp);
                    continue;
                }
                tmp = Math.abs(ll.get(ll.size() - i)) + ((1 <= right) ? Math.abs(ll.get(ll.size()-i))+rr.get(right-1) : 0 );
                res = Math.min(res, tmp);
            }
            System.out.println(res);
        } else {
            for (int i=0; i<=k-1; i++) {
                int left = i;
                int right = k - i - 1;
                if (l < i) continue;
                if (r < right) continue;
                long tmp = 0;
                if (i == 0) {
                    if (k != 1) tmp = rr.get(right-1);
                    res = Math.min(res, tmp);
                    continue;
                }
                tmp = Math.abs(ll.get(ll.size()-i)) + ((1 <= right) ? Math.abs(ll.get(ll.size()-i))+rr.get(right-1) : 0);
                res = Math.min(res, tmp);
//                if (i == 2) {
//                    System.out.println(Math.abs(ll.get(ll.size()-i)));
//                    System.out.println(rr.get(right-1));
//                }
//                if (i == 3) System.out.println(tmp);
            }
            System.out.println(res);
        }





    }
}
