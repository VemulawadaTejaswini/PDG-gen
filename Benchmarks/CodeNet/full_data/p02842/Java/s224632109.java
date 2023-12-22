import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

      int n1 = (int)(n/1.08);

      if (n!=(int)(n1*1.08)) {
        System.out.println(":)");
      }else{
        System.out.println(n1);
      }

  }
}
