import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N < 105) {
          System.out.println(0);
        } else if (N < 135) {
          System.out.println(1);
        } else if (N < 165) {
          System.out.println(2);
        } else {
          System.out.println(3);
        }  
    }
}