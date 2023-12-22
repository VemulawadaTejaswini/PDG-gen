import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a + b == 3){
		    out.println(3);
		}else if(a + b == 4){
		    out.println(2);
		}else{
		    out.println(1);
		}
        out.close();
        
    }
}