import java.util.*;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    //整数の入力
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    //これらの分け方が等しくなりうるかを判別する


    //出力
    isDivision(a, b, c);
  }
  static void isDivision(int a, int b, int c){
    if((a+b) == c || (a+c) == b || (b+c) == a){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }

}
