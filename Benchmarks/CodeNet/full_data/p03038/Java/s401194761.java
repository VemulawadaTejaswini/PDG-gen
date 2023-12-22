import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nmarray = reader.readLine().split(" ");
        int n = Integer.parseInt(nmarray[0]);
        int m = Integer.parseInt(nmarray[1]);
        int[] a = new int[n];
        String[] arr = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(a);
        BC[] bc = new BC[m];
        for (int j = 0; j < m; j++) {
            String[] bcarray = reader.readLine().split(" ");
            bc[j] = new BC(Integer.parseInt(bcarray[0]), Integer.parseInt(bcarray[1]));
        }
        Arrays.sort(bc);
        int index = 0;
        label: for (int j = 0; j < m; j++) {
            while (0 < bc[j].b && index < n) {
                if (a[index] < bc[j].c) {
                    a[index] = bc[j].c;
                    index++;
                    bc[j].b--;
                } else {
                    break label;
                }
            }
        }
        long sum = 0L;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }

    private static class BC implements Comparable<BC> {
        int b;
        int c;
        private BC(int b, int c) {
            this.b = b;
            this.c = c;
        }
        public int compareTo(BC o) {
            return this.c < o.c ? 1 : this.c == o.c ? 0 : -1;
        }
    }
}
