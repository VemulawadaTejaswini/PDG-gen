import java.io.*;
import java.util.*;
import java.util.ArrayList;
 
class Main
{
  public static void main (String[] arg)
  {
    Scanner scan = new Scanner(System.in);
    
    long a = Long.parseLong(scan.next()); //a
    long b = Long.parseLong(scan.next()); //b
    long c = Long.parseLong(scan.next()); //c
    
    if(4 * a * b < 
       (c * c) - 2 * c * (a + b) + (a * a + 2 * a * b + b * b)){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}
