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
	  int A = Integer.parseInt(sc.next());
      int B = Integer.parseInt(sc.next());
      if(A == 1){
      	A = 14;
      }
      if(B == 1){
      	B = 14;
      }
      if(A == B){
      	out.println("Draw");
      }else if(A < B){
      	out.println("Bob");
      }else{
      	out.println("Alice");
      }
      out.close();
    }
}