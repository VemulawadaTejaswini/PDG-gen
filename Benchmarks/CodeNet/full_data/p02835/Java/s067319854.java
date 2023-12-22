import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int w = sc.nextInt();
    if(n+m+w >= 22){
      System.out.print("bust");
    }else{
      System.out.print("win");
    }
  }
}
