import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int d = sc.nextInt();
      int n = sc.nextInt();
      int ans = 0;
      if(d==0&&n<100){
        ans = n;
      }else if(d==1){
        ans = 101;
      }
      if(d==1&&n<100){
        ans = n*100; 
      }else if(d==1){
        ans = 10001;
      }
      if(d==2&&n<100){
        ans = n*10000;
      }else if(d==2){
        ans = 1000001;
      }
      System.out.println(ans);
  }
}
