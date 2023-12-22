import java.util.*;

public class Main {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String topping = sc.next();
          String[] top = topping.split("");
          int count = 0;
          for(int i = 0; i < top.length; i++) {
            if("o".equals(top[i])){
              count++;
            }
          }
          System.out.println(700 + (count * 100));
      }
    }