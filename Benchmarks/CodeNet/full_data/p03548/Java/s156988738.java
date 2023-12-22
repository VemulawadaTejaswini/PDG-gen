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
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int count = 0;
        int ans = 0;

        while(ans <= x){
            ans = nbOfPplSit(count, y, z);
            count++;
        }

        System.out.println(count-2);
    }

    int nbOfPplSit(int num, int y, int z){
        return num * y + (num+1)*z;
    }

}