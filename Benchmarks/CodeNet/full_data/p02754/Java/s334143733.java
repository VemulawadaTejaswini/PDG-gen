import java.io.*;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    try {
      // 標準入力受け取り
      Scanner scan = new Scanner(System.in);      
      int sum      = scan.nextInt();
      int blue     = scan.nextInt();
      int red      = scan.nextInt();
      
      //算出
      if(sum%(blue+red)>blue) {
        System.out.println(sum/(blue+red)*blue+(blue-sum%(blue+red)));
      } else {
        System.out.println(sum/(blue+red)*blue+sum%(blue+red));
      }
      
    } catch (Exception e) {     
      System.out.print("error");
    }
  }
}