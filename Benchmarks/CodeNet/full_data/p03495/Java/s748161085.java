import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] ar = new int[200000];
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            ar[sc.nextInt()]++;
        }
        Arrays.sort(ar);
        int ind = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != 0) {
                ind = i;
                break;
            }
        }
        long ans = 0;
        for (int i = ind; i < 200000  - k; i++) {
            ans += ar[i];
        }
        System.out.println(ans);
    }
}
