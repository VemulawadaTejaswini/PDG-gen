import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
		int h = scan.nextInt();
		int a = scan.nextInt();
        
        out.println(h % a == 0 ? (h / a) : (h / a + 1));
        out.close();
        
    }
}