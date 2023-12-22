import java.util.*;

public class Main {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int num1 = sc.nextInt();
          int num2 = sc.nextInt();
          int num3 = sc.nextInt();
          if(num1 + num2 + num3 >= 22){
            System.out.println("bust");
          } else {
            System.out.println("win");
          }
      }
    }
