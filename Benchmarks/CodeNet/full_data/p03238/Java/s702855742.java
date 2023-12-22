import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        if (n == 1){
            System.out.println("Hello World");
        }else{
            System.out.println(Integer.parseInt(input.readLine()) +  Integer.parseInt(input.readLine()));
        }
    }
}
