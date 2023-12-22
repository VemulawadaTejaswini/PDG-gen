import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = sc.nextInt();
        sc.nextLine();
        int[] d  = toArray(sc.nextLine());
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                res += d[i]*d[j];
            }
        }
        System.out.println(res);
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
