
import java.util.*;
public class Main{
  
  public static void main(String [] args){
    Scanner inp = new Scanner(System.in);
    int r = inp.nextInt();
    int g = inp.nextInt();
    int b = inp.nextInt();
    if((10 * g + b) % 4 == 0)
      System.out.println("YES");
    else
      System.out.println("NO");
  }
}

