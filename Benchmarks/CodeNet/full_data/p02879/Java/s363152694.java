import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
		int a = scan.nextInt();
		int b = scan.nextInt();
		
        out.println(a <= 9 && b <= 9 ? a * b : -1);
        out.close();
        
    }
}