import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	InputStream input = System.in;
      	OutputStream output = System.out;
      	Scanner sc = new Scanner(input);
      	PrintWriter out = new PrintWriter(output);
      	String A = sc.next();
      	String B = sc.next();
      	String C = sc.next();
      	out.println(A.charAt(0) + "" + B.charAt(0) + "" + C.charAt(0));
      	out.close();
    }
}