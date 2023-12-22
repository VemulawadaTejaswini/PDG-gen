import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = sc.nextInt();

        long count = 0;
        Map<String, Integer> map = new HashMap<String, Integer>(N);
        for (int i = 0; i < N; i++) {
            char[] s = sc.next().toCharArray();
            Arrays.sort(s);
            String S = String.valueOf(s);
            if (map.containsKey(S)) {
                Integer temp = map.get(S);
                count += temp.intValue();
                map.put(S, temp.intValue() + 1);
            } else {
                map.put(S, 1);
            }
        }
        sc.close();

        out.printf("%d\n", count);
        out.flush();
    }
}
