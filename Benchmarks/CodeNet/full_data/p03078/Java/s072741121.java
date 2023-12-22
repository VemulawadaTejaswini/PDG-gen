import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] tmp = br.readLine().split(" ");
        int x = Integer.parseInt(tmp[0]);
        int y = Integer.parseInt(tmp[1]);
        int z = Integer.parseInt(tmp[2]);
        int k = Integer.parseInt(tmp[3]);
        long[] a = new long[x];
        tmp = br.readLine().split(" ");
        for(int i = 0; i < x; i++) {
            a[i] = Long.parseLong(tmp[i]);
        }
        long[] b = new long[y];
        tmp = br.readLine().split(" ");
        for(int i = 0; i < y; i++) {
            b[i] = Long.parseLong(tmp[i]);
        }
        long[] c = new long[z];
        tmp = br.readLine().split(" ");
        for(int i = 0; i < z; i++) {
            c[i] = Long.parseLong(tmp[i]);
        }

        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i1 = 0; i1 < x; i1++) {
            for(int i2 = 0; i2 < y; i2++) {
                for(int i3 = 0; i3 < z; i3++) {
                    pq.add(a[i1] + b[i2] + c[i3]);
                }
            }
        }

        for(int i = 0; i < k; i++) {
            System.out.println(pq.poll());
        }
    }
}