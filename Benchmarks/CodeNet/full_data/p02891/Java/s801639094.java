import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Scratch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        long k = Integer.parseInt(br.readLine());
        int[] arr = new int[s.length()];
        int count = 1;
        int j = 0;
        int ans = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                ans += count/2;
                count = 0;
                arr[j++] = count;
            }
            count++;
        }
        arr[j++] = count;
        ans += count/2;
        ans *= k;
        if (j == 1) {
            System.out.println(arr[j] * k);
        } else if ((s.charAt(0) == s.charAt(s.length() - 1)) &&
                (arr[0] % 2 == 1) && (arr[j] % 2 == 1)){
            ans += k - 1;
        }
        System.out.println(ans);
        bw.flush();
        bw.close();
        br.close();
    }
}