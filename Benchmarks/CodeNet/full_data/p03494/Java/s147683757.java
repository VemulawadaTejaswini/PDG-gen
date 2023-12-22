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
      int N = Integer.parseInt(sc.next());
      int bit = 0;
      for(int i = 0; i < N; i++){
      	bit |= Integer.parseInt(sc.next());
      }
      out.println(Integer.numberOfTrailingZeros(bit));
      out.close();
    }
}