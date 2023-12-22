import java.util.*;
public class Main{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);    //整数の入力
      int D = sc.nextInt();
      int N = sc.nextInt();
      if(N==100){
        System.out.print((int) (Math.pow(100, D) * 101)) ;
      } else {
        System.out.print((int) (Math.pow(100, D) * N));
      }
  }
}