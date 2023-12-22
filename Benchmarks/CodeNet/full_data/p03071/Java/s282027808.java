import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int coin = 0;
    if(a>=b){
      coin = coin + a;
      if(a-1>=b){
        coin = coin + (a-1);
      }else{
        coin = coin + b;
      }
    }else{
      coin = coin + b;
      if(b-1>=a){
        coin = coin + (b-1);
      }else{
        coin = coin + a;
      }
    }
    System.out.println(coin);
 }
}