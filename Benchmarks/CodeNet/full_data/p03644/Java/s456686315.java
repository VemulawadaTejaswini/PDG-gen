import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());

        int start = 0;
        while (start * 2 <= n){
            if (start == 0){
                start = 2;
            }else{
                start *= 2;
            }
        }

        System.out.println(start);
    }
}
