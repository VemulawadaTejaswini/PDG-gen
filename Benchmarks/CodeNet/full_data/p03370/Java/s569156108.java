import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line[] = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int x = Integer.parseInt(line[1]);
        int min = 1000, sum = 0, temp;
        
        for (int i = 0; i < n; i++) {
            temp = Integer.parseInt(br.readLine());
            if (temp < min) min = temp;
            sum += temp;
        }
        
        
        
        System.out.println(n + (x-sum)/min);
    }
}
