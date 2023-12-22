import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        if(f.readLine().contains("7")){
            out.println("Yes");
        }else{
            out.println("No");
        }
    }
}
