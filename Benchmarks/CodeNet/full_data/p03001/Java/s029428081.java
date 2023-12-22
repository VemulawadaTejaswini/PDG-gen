import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int h = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int count = 0;

    if(x==w/2 && y==h/2){
      count += 1;
    }
    System.out.println(w*h/2+" "+count);
  }
}