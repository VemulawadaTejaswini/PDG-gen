import java.io.*;
import java.util.Arrays;

/**
 * Created by Ayushi on 04/08/2019.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] a = r.readLine().split("");
        int l = a.length;
        int[] b = new int[l];
        Arrays.fill(b, 0);
        r.close();
        int j, c;
        for (int i = 0; i < l; i++) {
            c = i;
            //System.out.println(Arrays.toString(b));
            for (j = 1; true; j++) {
                if (a[c].equals("R")) {
                    c++;
                    if (a[c].equals("L")) {
                        if (j % 2 == 0) {
                            b[c]++;
                        }
                        else {
                            b[c-1]++;
                        }
                        break;
                    }
                }
                else {
                    c--;
                    if (a[c].equals("R")) {
                        if (j % 2 == 0) {
                            b[c]++;
                        }
                        else {
                            b[c+1]++;
                        }
                        break;
                    }
                }
            }
        }

        for (int k = 0; k < l; k++) {
            System.out.print(b[k] + " ");
        }
    }
}
