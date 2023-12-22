import java.util.Scanner;
 
public class Test {
   
  public static void main(String args[]) {
     
      Scanner scan = new Scanner(System.in);

      float width = scan.nextFloat();
      float height = scan.nextFloat();
      float naname = scan.nextFloat();

      scan.close();
 
      // 面積
      float area = width * height / 2;
 
      // 答えを表示する
      System.out.println(area);
  }
}