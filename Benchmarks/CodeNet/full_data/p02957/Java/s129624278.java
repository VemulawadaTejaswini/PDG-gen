import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      int k = Integer.parseInt(sc.next());
      
      if(Math.abs(a-k) == Math.abs(b-k)) {
        System.out.println(k);
      } else {
        System.out.println("IMPOSSIBLE");
      }
    }
}