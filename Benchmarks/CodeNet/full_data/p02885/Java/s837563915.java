import java.util.*;
import java.math.*;
import java.lang.*;

public class Main{
  public static void main(String args[]) throws IOException{
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    if(a>(2*b))
      System.out.println(a-(2*b));
    else
      System.out.println(0);
  }
}
