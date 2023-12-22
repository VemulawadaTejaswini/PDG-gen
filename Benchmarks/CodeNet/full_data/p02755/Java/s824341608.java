import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ans = a*100/8;
    int bans = 0;
    bans = ans / 10;
    if (bans != b){
      ans=-1;
    }
    System.out.println(ans);
      
  }
}


