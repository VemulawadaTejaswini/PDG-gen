import java.util.*;
import java.io.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String i = sc.next();
    String o = "";
    for(int k = 0; k < i.length(); k++)
    {
      o += "x";
    }
    System.out.println(o);
  }
}