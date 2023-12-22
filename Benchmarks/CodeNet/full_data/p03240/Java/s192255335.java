import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }

        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                int[] dist = new int[300];
                HashMap<Integer, Integer> mm = new HashMap<>();
                boolean ok = true;
                for (int k = 0; k < 300; k++) {
                    dist[k] = -1;
                }
                for (int k = 0; k < n; k++) {
                    int d = Math.abs(i - y[k]) + Math.abs(j - x[k]);
                    if (dist[d] == -1) {
                        dist[d] = h[k];
                    } else {
                        if (dist[d] != h[k]) {
                            ok = false;
                            break;
                        }
                    }

                    if (h[k] != 0 && mm.containsKey(h[k]) && mm.get(h[k]) != d) {
                        ok = false;
                        break;
                    }
                    if (h[k] != 0 && !mm.containsKey(h[k])) {
                        mm.put(h[k], d);
                    }
                }

                long d = (long) Math.abs(i - y[0]) + Math.abs(j - x[0]) + h[0];
                for (int ll = 0; ll < n; ll++) {
                    d = (long) Math.abs(i - y[ll]) + Math.abs(j - x[ll]) + h[ll];
                    if (d <= 0) {
                        ok = false;
                        continue;
                    }
                    for (int k = 0; k < n; k++) {
                        long hh = (long) Math.max(d - Math.abs(y[k] - i) - Math.abs(x[k] - j), 0);
                        if (hh != h[k]) {
                            ok = false;
                            break;
                        }
                    }

                }
                if (ok) {
                    System.out.println(j + " " + i + " " + d);
                }

            }
        }
    }

}
