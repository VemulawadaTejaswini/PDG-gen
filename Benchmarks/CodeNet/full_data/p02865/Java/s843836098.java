import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class a {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m;
        int n = 0;
        try {
            String str = reader.readLine();
            n = Integer.parseInt(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(n % 2 == 0){
            m = n / 2 - 1;
        } else{
            m = n / 2;
        }
        if(n <= 2){
            m = 0;
        }
        if(n == 3){
            m = 1;
        }
        System.out.println("" + m);
    }   
}