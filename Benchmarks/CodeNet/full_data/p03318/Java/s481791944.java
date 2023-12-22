import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = a/9;
    int c = a%9;
    for (int i = 0;i < b; i++) {
      for (int j = 1;j < 10;j++) {
        System.out.print(j);
        for (int k = 0; k<i;k++) {
          System.out.print("9");
        }
        System.out.print("\n");
      }
    }
    for (int j = 1;j<=c;j++) {
      System.out.print(j);
      for (int k = 0; k<b;k++) {
        System.out.print("9");
      }
      System.out.print("\n");
    }
  }
}
