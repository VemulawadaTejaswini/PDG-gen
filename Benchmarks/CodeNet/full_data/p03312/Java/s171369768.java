import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        long sum = 0;
        for(int i : a) sum += i;
        long min_answer = Long.MAX_VALUE;
        hihi: for(int i=0; i<16; i++) {
          boolean[] b = new boolean[4];
          for(int j=0; j<4; j++) {
            if((i/(1 << j)) % 2 == 0) b[j] = true;
            else b[j] = false;
          }
          long cur_sum = 0;
          long cur_total = sum;
          int cur_index = 0;
          long min_sum = Long.MAX_VALUE;
          long max_sum = Long.MIN_VALUE;
          for(int j=0; j<4; j++) {
            while((cur_sum*(4-j) < cur_total) && (cur_index < n) && ((cur_sum + a[cur_index])*(4-j) < cur_total)) {
              cur_sum += a[cur_index];
              cur_index++;

            }

            if(b[j] && (cur_index < n)) {
              cur_sum += a[cur_index];
              cur_index++;
            }
            if(j == 3) {
              while(cur_index < n) {
                cur_sum += a[cur_index];
                cur_index++;
              }
            }
            if(cur_sum == 0) continue hihi;
            if(cur_sum < min_sum) min_sum = cur_sum;
            if(cur_sum > max_sum) max_sum = cur_sum;
          //  out.println(cur_sum + " (cur)");
            cur_total -= cur_sum;
            cur_sum = 0;

          }
          if((max_sum-min_sum) < min_answer) min_answer = (max_sum-min_sum);
        //  out.println(min_answer + " (ans)");
        }
        out.println(min_answer);
        // int n = Integer.parseInt(st.nextToken());
        // int n = scan.nextInt();

        out.close(); System.exit(0);
    }
}
