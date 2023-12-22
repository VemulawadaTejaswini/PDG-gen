import java.util.*;
 
public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            String[] str2 = str.split("");
              if("7".equals(str2[0]) || "7".equals(str2[1]) || "7".equals(str2[2])){
                System.out.println("Yes");
              } else {
                System.out.println("No");
              }
          }
}