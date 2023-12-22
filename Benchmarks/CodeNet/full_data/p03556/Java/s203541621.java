import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int ans = 0;

        while(true){
            ans = heihou(count);
            if(ans > n){
                ans = heihou(count-1);
                break;
            }
            count++;
        }

        System.out.println(ans);
    }

    int heihou(int num){
        return num*num;
    }
}