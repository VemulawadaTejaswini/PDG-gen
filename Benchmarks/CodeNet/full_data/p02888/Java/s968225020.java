import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = sc.nextInt();
        sc.nextLine();
        int[] L  = toArray(sc.nextLine());
        Arrays.sort(L);
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                int a = L[i], b = L[j];
                int max = a+b, min = b-a;
                int end = search(L, j, max) - 1;
                int start = search(L, j, min) + 1;
                res += end-start+1;
            }
        }
        System.out.println(res);
    }

    public static int search(int[] L, int start, int val) {
        int pos = Arrays.binarySearch(L, start, L.length, val);
        if (pos < 0) {
            return -(pos+1);
        }
        return pos;
    }

    private static int[] toArray(String text) {
        String[] vars = text.split("\\s+");
        int[] res = new int[vars.length];
        for (int i = 0; i < vars.length; i++) {
            res[i] = Integer.valueOf(vars[i]);
        }
        return res;
    }
}
