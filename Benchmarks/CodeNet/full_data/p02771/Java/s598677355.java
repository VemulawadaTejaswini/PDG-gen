import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a == b && b == c){
		    out.println("No");
		}else if(a != b && b != c && c != a){
		    out.println("No");
		}else{
		    out.println("Yes");
		}
        out.close();
        
    }
}