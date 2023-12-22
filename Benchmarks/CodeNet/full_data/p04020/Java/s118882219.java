/**
 * Created by abhishek on 8/4/2016.
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int array[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if ((array[i] & 1) == 1 && (array[i + 1] & 1) == 1) {
                ans += array[i] / 2 + array[i + 1] / 2 + 1;
                array[i + 1] = 0;
            } else if ((array[i] & 1) == 1 && array[i + 1] > 0) {
                ans += array[i] / 2 + array[i + 1] / 2;
                array[i + 1] = 1;
            }
            else ans += array[i]/2;
            //System.out.println(array[i] + " " + ans);
        }
        System.out.print(ans + array[n]/2);
    }
}
