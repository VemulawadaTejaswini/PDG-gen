import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double A = Integer.parseInt(sc.next());
    double B = Integer.parseInt(sc.next());
    if((A+B) % 2 == 0){
      System.out.println(int((A+B)/2));
    }else{
      System.out.println("IMPOSSIBLE");
    }
  }
}
