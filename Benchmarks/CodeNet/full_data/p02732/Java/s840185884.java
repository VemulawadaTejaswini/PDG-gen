import java.io.PrintWriter;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<n; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                int tmp = map.get(arr[i]);
                map.put(arr[i], tmp+1);
            }
        }

        long[] combi = new long[n+1];

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();
            combi[key] = val*(val-1)/2;
        }

//        out.print(map);
//        out.flush();

        long ans = 0;

        long sum = 0;

        for (int i=0; i<n+1; i++) {
            sum += combi[i];
        }

        for (int i=0; i<n; i++) {
            int tmp = arr[i];
            int tmpAns = map.get(tmp);
            int diff = (tmpAns)*(tmpAns-1)/2-(tmpAns-1)*(tmpAns-2)/2;
            sb.append((sum-diff)+"\n");
        }


        out.print(sb.toString());
        out.flush();

    }

}
