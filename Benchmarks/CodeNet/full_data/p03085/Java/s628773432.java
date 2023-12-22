import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String base = sc.next();
            switch(base) {
              case "A":
                System.out.println("T");
              case "C":
                System.out.println("G");
              case "G":
                System.out.println("C");
              case "T":
                System.out.println("A");
            }
      }
}