import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System,in);
            String str = sc.next();
            String[] str2 = str.split("");
            if(str[2] == str[3] && str[4] == str[5]){
              System.out.println("Yes");
            } else {
              System.out.println("No");
            }
      }
}