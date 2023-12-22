import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner sc = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
      	int R = Integer.parseInt(sc.next());
      	String ans = "ABC";
      	if(1200 <= R && R < 2800){
        	ans = "ARC";
        }else if(2800 <= R){
        	ans = "AGC";
        }
      	out.println(ans);
        out.close();
    }
}