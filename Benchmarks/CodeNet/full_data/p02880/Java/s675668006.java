import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean no = false;
        for(int i = 1; i < 10; i++)
        {
            if(n % i == 0) {
                if(n / i < 10) no = true;
            }
        }
        if(!no) System.out.println("No");
        else System.out.println("Yes");
        br.close();
    }
}