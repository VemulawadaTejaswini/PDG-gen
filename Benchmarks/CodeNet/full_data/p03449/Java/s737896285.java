import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str_raw1[] = br.readLine().split(" ");
        String str_raw2[] = br.readLine().split(" ");
        int[] raw1 = new int[n];
        int[] raw2 = new int[n];
        for (int i = 0; i < n; i++) {
            raw1[i] = Integer.parseInt(str_raw1[i]);
            raw2[i] = Integer.parseInt(str_raw2[i]);
        }
        
        int[] sums = new int[n];
        int max = -1;
        for (int i = 0; i < n; i++) {
            sums[i] = 0;
            for (int j = 0; j <= i; j++) {
                sums[i] += raw1[j];
            }
            for (int k = i; k < n; k++) {
                sums[i] += raw2[k];
            }
            max = Math.max(sums[i], max);
        }
        
        System.out.println(max);
    }
}
