import java.util.*;

public class Main {
	public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      int H = sc.nextInt();
      int A = sc.nextInt();
      System.out.printf("%d", ((H - 1) / A + 1));
      sc.close();
      
    }
}