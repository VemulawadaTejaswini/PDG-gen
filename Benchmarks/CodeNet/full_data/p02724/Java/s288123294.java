import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        int x = Integer.parseInt(br.readLine());
        int count500 = x / 500;
        int count5 = x % 500 / 5;
        
        out.println(1000 * count500 + 5 * count5);
        
        out.close();
        
    }
}