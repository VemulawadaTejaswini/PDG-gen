import java.util.*;

public class Main{
  public static void mian(Stirng[] args){
    int t = 0;
    int x = 0;
    
    Scanner scan = new Scanner(System.in);
    t = scan.nextInt();
    x = scan.nextInt();
    
    int time = x / t;
    
    System.out.println(time);
  }
}