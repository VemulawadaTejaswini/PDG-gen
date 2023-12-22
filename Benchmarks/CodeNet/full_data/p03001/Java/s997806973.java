import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int h = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int l = 0;
    double a = w*h/(double)2;
    
    if((double)x == w/2.0 && (double)y == h/2.0) l++;
    
  	System.out.println(a + " " + l);
    
    
  }
}
