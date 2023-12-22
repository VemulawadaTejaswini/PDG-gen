import java.util.*;

class Main{
  public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double ave = (a + b) / 2;
      System.out.println((int)Math.ceil(ave));
    }
  }
}
      
    