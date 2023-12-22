import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            String[] str2 = str.split("");
            str2[3] = "8";
            for(String s : str2){
              System.out.print(s);
            }
      }
}