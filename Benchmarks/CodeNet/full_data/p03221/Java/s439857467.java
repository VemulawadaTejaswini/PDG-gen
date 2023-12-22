import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Map<Integer, int[]> map = new TreeMap<>();
        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(sc.next());
            int[] ary = new int[2];
            ary[0] = a;
            ary[1] = i;
            int b = Integer.parseInt(sc.next());
            map.put(b, ary);
        }
        String[] ans = new String[m];
        int[] pary = new int[n];
        for (int[] num : map.values()) {
            pary[num[0] - 1]++;
            ans[num[1]] = String.format("%06d%06d", num[0], pary[num[0] - 1]);
        }
        StringBuilder sb = new StringBuilder();
        for (String s: ans) {
            sb.append(s + "\n");
        }
        System.out.println(sb.toString());
    }
}