import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int string = br.readLine();
    
    if(a>=3200)
    {
      System.out.println(string);
    }
    else
    {
      System.out.println("red");
    }
  }
}
  