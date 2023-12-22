import java.io.*;

public class Main{
  public static void main(String[] args) {
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String a, b, c, d;
      int y=700;
      a = reader.readLine();
      b = a.substring(0,1);
      c = a.substring(1,2);
      d = a.substring(2);
      
      if(b.equals("o")){
        y = y+100;
      }
      if(c.equals("o")){
        y = y+100;    
      }
      if(d.equals("o")){
        y = y+100;
      }

      System.out.println(y);
      
    }
    catch (Exception e) {
      
    }
  }
}