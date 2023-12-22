import java.util.*;
public class Main{
  public static void main(string[] args){
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());
    System.out.println(k * x + (n-k) * y);
  }
}