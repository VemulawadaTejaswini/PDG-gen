import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String args[]) {
        int N, a[];
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String buf = br.readLine();
            N = Integer.parseInt(buf);
            a = new  int[N];
            br = new BufferedReader(new InputStreamReader(System.in));
            buf = br.readLine();
            String coord[] = buf.split(" ");
            int min = 1001, max = -1;
            for (int i = 0; i < N; i++) {
                a[i] = Integer.parseInt(coord[i]);
                if (a[i] < min) min = a[i];
                if (max < a[i]) max = a[i];
            }
            System.out.println(max - min);
        } catch (Exception e) {
            System.err.println("Exception: " + e);
        }
    }
}
