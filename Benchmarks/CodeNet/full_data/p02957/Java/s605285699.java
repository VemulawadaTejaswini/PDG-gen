import java.util.*;
public class Main{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  if(a>b){
    int x = a%2;
    int y = b%2;
      if(x==0 && y==0){
        int ak = (a-b)/2;
        int k = a-ak;
        System.out.println(k);
      }else{
        System.out.println("IMPOSSIBLE");
      }
  }else{
    int x = b%2;
    int y = b%2;
      if(x==0 && y==0){
        int bk = (b-a)/2;
        int k = b-bk;
        System.out.println(k);
      }else{
        System.out.println("IMPOSSIBLE");
      }
    }
  }
}