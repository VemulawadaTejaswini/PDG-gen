import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    //height
    int h = sc.nextInt();
    //width
    int w = sc.nextInt();
    
    for (int i = 0; i < h; i++){
      String s = sc.next();
      System.out.println(s + "\r\n" + s);
    }
  }
}