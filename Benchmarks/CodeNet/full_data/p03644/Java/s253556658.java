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
        int input = sc.nextInt();
int n = 1;
        while(true){
if (n > input) {
n/=2;
break;}

n*=2;
}

if (input == 1) System.out.println(1);
else System.out.println(n);
    }

}
