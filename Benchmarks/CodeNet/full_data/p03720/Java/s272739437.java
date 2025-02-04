
import java.io.*;
import java.util.*;
//import java.util.stream.*;
//import java.math.*;

public class Main {

    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //forl(n, array, sc);
        int n1, n2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            if (map.get(n1) == null) {
                map.put(n1, 1);
            } else {
                map.put(n1, map.get(n1) + 1);
            }
            if (map.get(n2) == null) {
                map.put(n2, 1);
            } else {
                map.put(n2, map.get(n2) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
        bw.flush();
    }

    public static void forl(int n, int[] array, Scanner sc) {
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
    }
}
