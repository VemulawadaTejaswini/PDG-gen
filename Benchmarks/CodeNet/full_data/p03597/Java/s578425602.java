import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
  public static void main(String args[])
  {
    Scanner input=new Scanner(System.in);
    
    int g=input.nextInt();
    int w=input.nextInt();
    if(g>=1 && g<=100 && w>=0 && w<= (g*g))
    {
      g=g*g;
      w=g-w;
      System.out.println(w);
    }
  }
}