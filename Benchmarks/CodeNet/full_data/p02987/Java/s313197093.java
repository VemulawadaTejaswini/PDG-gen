import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] str = sc.next().split("");
            Array.sort(str);
            if(str[0].equals(str[1]) && str[2].equals(str[3])){
              System.out.println("Yes");
            } else {
              System.out.println("No");
            }
          }
}
