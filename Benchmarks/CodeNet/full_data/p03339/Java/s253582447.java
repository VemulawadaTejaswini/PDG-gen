import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    int[] inputArray;

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] S = sc.next().toCharArray();
        int ans = 3 * 100000;
        int[] nbW = new int[N];

        nbW[0] = 0;
        if(S[0] == 'W'){
            nbW[0] = 1;
        }

        for(int i=1; i<N; i++){
            if(S[i] == 'W'){
                nbW[i] = nbW[i-1]+1;
            } else {
                nbW[i] = nbW[i-1];
            }
        }


        for(int i=0; i<N; i++){
            int left = 0;
            if(i != 0){
                left = nbW[i-1];
            }
            int right = (N-(i+1)) - (nbW[N-1] - nbW[i]);
            int count = left + right;
            ans = Math.min(ans, count);
        }

        System.out.println(ans);
    }
}