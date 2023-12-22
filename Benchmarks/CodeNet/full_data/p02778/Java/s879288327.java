import java.util.*;
import java.io.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String s = "";
    for(int i = 0; i < sc.next().length(); i++)
      s += "x";
    System.out.println(s);
  }
}