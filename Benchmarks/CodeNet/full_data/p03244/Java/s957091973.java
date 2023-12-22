import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n / 2];
        int[] b = new int[n / 2];
        for (int i = 0; i < n / 2; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int[] oddrec = new int[100000 + 5];
        int[] evenrec = new int[100000 + 5];
        for (int i = 0; i < n / 2; i++) {
            oddrec[a[i]]++;
            evenrec[b[i]]++;
        }
        int[][] odd = new int[100000 + 5][];
        int[][] even = new int[100000 + 5][];
        for (int i = 0; i < oddrec.length; i++) {
            odd[i] = new int[]{i, oddrec[i]};
            even[i] = new int[]{i, evenrec[i]};


        }
        mycom mc = new mycom();
        Arrays.sort(odd, mc);
        Arrays.sort(even, mc);
        int len = odd.length;
        int ans;
        if (odd[len - 1][0] != even[len - 1][0]) {
            ans = n - odd[len - 1][1] - even[len - 1][1];
        } else {
            ans = Math.min(n - odd[len - 1][1] - even[len - 2][1], n - odd[len - 2][1] - even[len - 1][1]);
        }

        System.out.println(ans);

    }
    static class mycom implements Comparator<int[]> {
        public int compare(int[] a, int[] b) {
            return a[1] - b[1];
        }
    }
}