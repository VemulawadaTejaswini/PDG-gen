import java.util.Scanner;
import java.lang.Math;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.next();
    int b = sc.next();
    int alen = String.valueOf( a ).length();
    for(alen > 1){
      int ten = 10
      ten * 10;
      alen--;
    }
    int num = ten * a + b;
    double k = Math.sqrt(num);
    if(k * k == num){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}