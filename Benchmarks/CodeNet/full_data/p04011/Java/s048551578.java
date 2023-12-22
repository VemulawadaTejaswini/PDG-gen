import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        int k = Integer.parseInt(input.readLine());
        int x = Integer.parseInt(input.readLine());
        int y = Integer.parseInt(input.readLine());
        if (k >= n) {
            System.out.println(n *  x);
        }else {
            int sum = k * x;
            sum+= (n-k) * y;
            System.out.println(sum);
        }
    }
}
