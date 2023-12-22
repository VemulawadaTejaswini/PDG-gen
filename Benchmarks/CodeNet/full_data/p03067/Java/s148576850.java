import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String... args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        int c = 0;
        try {
            a = Integer.parseInt(bufferedReader.readLine());
            b = Integer.parseInt(bufferedReader.readLine());
            c = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e){
            e.printStackTrace();
            return;
        }

        if(c < Math.abs(a-b)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}