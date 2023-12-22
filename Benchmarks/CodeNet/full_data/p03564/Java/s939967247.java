import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    int k;

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        k = sc.nextInt();
        int ans = 1;

        for(int i=0; i<n; i++){
            ans = plusOrTimes(ans);
        }

        System.out.println(ans);
    }

    int plusOrTimes(int num){
        int plus = num + k;
        int times = num * 2;

        if(plus > times){
            return times;
        } else {
            return plus;
        }
    }
}