import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());

        if(line == 1){
            System.out.println(line);
        }
        else{
            int x = 1;
            for(; x <= line;){
                x = x * 2;            
            }
            
            x = x / 2;
            System.out.println(x);
        }
    }
}
