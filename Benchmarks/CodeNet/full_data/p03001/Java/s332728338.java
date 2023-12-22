import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int W = sc.nextInt();
    int H = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    
    if(x*2==W && y*2==H){
      System.out.println((W*H)/2 + ".000000 1");
    }else{
      System.out.println((W*H)/2 + ".000000 0");
    }
  }
}
