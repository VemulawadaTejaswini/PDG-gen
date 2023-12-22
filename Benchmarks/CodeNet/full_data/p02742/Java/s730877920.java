import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long h = sc.nextLong();
    long w = sc.nextLong();
    long ans = 1;

    if(w % 2 == 0){
      ans = (h * w) / 2;
    } else if(h % 2 == 0){
      ans = h * (w / 2) + (h / 2);
    } else {
      ans = h * (w / 2) + ((h / 2) + 1) ;
    }
    System.out.println(ans);
  }
}
