import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int h = Integer.parseInt(br.readLine());
        int w = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int max = Math.max(h, w);
        int ans = (n + max - 1) / max;
        System.out.println(ans);
    }
}
