import java.util.*;
public class AWhiteCells{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int H = sc.nextInt();
      int W = sc.nextInt();
      int h = sc.nextInt();
      int w = sc.nextInt();

      int all = H*W;

      if(all-(h*W+(H-h)*w)<=0){
        System.out.println(0);
        System.exit(0);
      }
      System.out.println(all-(h*W+(H-h)*w));
  }
}
