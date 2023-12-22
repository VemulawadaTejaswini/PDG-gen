import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int tap = sc.nextInt();
      int over = sc.nextInt();
      boolean flg = true;

      int use = tap;
      int count = 1;
          while (flg) {
        if (use >= over) {
          flg = false;
        } else {
          use += tap;
          use -= 1;
          count++;
        }
      }

      System.out.println(count);
    }
}