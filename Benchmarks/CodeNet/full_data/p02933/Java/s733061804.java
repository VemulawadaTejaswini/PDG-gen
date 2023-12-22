import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String s = br.readLine();
        
        if ( a < 3200 ) {
            System.out.println("red");
        } else {
            System.out.println(s);
        }
        
    }
}
