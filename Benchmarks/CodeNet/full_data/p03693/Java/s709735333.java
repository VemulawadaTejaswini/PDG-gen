import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
      
        if (((r * 100 ) + (g * 10) + b ) % 4 == 0) {
          System.out.println("Yes");
        }
        else {
          System.out.println("No");
        }
    }
}