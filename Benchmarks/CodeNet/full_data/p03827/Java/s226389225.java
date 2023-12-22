import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        String S = br.readLine();

        int ans=0;
        int init=0;
        for (int i=0; i<N; i++){
            if(S.charAt(i)=='I'){
                init++;
                ans = Math.max(ans, init);
            }
            else
                init--;
        }

        System.out.println(ans);
    }
}
