

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        String S = br.readLine();
        int[] arr = new int[N];
        for (int i=0; i<N-1; i++) {
            if (S.charAt(i)=='A' && S.charAt(i+1)=='C') {
                arr[i]++;
            }
        }
        for (int i=0; i<Q; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int count = 0;
            for (int j = a-1; j < b - 1; j++) {
                count += arr[j];
            }
            System.out.println(count);
        }
    }
}
