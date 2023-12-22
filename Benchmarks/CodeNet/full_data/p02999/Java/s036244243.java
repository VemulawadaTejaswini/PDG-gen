import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int h = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int count = 0;

    if((double)x==(double)w/2 && (double)y==(double)h/2){
      count += 1;
    }
    System.out.println((double)w*(double)h/2+" "+count);
  }
}