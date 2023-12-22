import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    int x = scan.nextInt();
    
    double time = (double)(t / x);
    
    System.out.pritnln(time);
  }
}