import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            String [] str = sc.next().split("");
            String a = sc.next();
            for(int i = 0; i < N; i++){
              System.out.print(str[i]);
              System.out.print(a.substring(0, 1));
            }
        System.out.println("");
      }
}