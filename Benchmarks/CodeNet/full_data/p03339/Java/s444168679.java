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

        for(int i=0; i<S.length; i++){
            int count = 0;

            for(int j=0; j<S.length; j++){
                if(i == j) continue;
                else if(j < i){
                    if(S[j] == 'W'){
                        count++;
                    }
                } else{
                    if(S[j] == 'E'){
                        count++;
                    }
                }
            }

            ans = Math.min(ans, count);
        }

        System.out.println(ans);
    }
}