import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int h = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    
    double area = (w*h)/2;
    int ju = 0;
    
    if(w == 2*x && h == 2*y) ju = 1;

    System.out.println(area + " " + ju);
    
  }
}