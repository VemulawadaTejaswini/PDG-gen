

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee {

    

    public static void main(String[] args) throws IOException {
        
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        String s = br.readLine();
        if(s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)) {
            System.out.println("Yes");
        }  else {
           System.out.println("No");    
        }

        
    }
}
