import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            String[] str2 = str.split("");
            if(str2[2].equals(str2[3]) && str2[4].equals(str2[5])){
              System.out.println("Yes");
            } else {
              System.out.println("No");
            }
      }
}