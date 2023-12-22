import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y = scan.nextInt();
    int z = scan.nextInt();

    double rx = Math.sqrt(x);
    double ry = Math.sqrt(y);
    double rz = Math.sqrt(z);

    if(rx + ry < rz){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
