import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = Integer.parseInt(sc.nextLine()); //人数
    float sum = 0.0f;
    for (int i = 0; i < num; i++) {
      String[] str = sc.nextLine().split(" ");
      float price = Float.parseFloat(str[0]);
      String tanni = str[1];
      
      sum += (tanni.equals("JPY")) ? price : 380000.0 * price;
    }
    
    System.out.println(sum);
  }
}