import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 1; i <= a; i++){
            if(i%3 != 0 && i%3 != 0){
                sum+= i;
            }
        }
        System.out.println(sum);
    }
}